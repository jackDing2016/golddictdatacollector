package com.jack.service;


import com.jack.client.MybatisClient;
import com.jack.dao.WordMapper;
import com.jack.model.Word;
import com.jack.model.WordExample;
import com.jack.service.HistoryService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.input.BufferedFileChannelInputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class HistoryServiceImpl implements HistoryService {

    private static String pivot;

    private static String historySource = "/home/jack/.local/share/goldendict/history";

    public List<String> readHistory() {
//        BufferedFileChannelInputStream bufferedFileChannelInputStream =
//                new BufferedFileChannelInputStream(new File(historySource));
//
//        bufferedFileChannelInputStream.read();
//
//        BufferedReader bufferedReader =new BufferedReader()

        try {
            FileReader fileReader = new FileReader(historySource);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> list = new ArrayList<>();

            bufferedReader.lines().forEach(
//                System.out::println
                    x -> list.add(parseWord(x))
            );

            return list;

        } catch (Exception e) {

        }

        return null;

    }

    private String getPivot() {
        return pivot;
    }

    public void setPivot(String value) {
        pivot = value;
    }

    private String freshPivot(List<String> list) {
        if (CollectionUtils.isEmpty(list)) return null;

        return null;
    }

    /**
     * @param list
     * @return
     */
    private List<String> chooseDataWriteFromHistory(List<String> list) {
        if (CollectionUtils.isEmpty(list)) return null;
        String pivot = getPivot();
        /**
         * if pivot is null (most of this case is maybe when the program start soon)
         * we don't do write operation (because if we do write it will add all history
         * at the beginning when starting the program ).
         */
        if (StringUtils.isEmpty(pivot)) {
//            setPivot(list.get(0));
            return null;
        } else {
            return list.subList(0, list.indexOf(pivot));
        }
    }

    private void write(List<String> list) {

        // Choose data to write
        List<String> listForSave = chooseDataWriteFromHistory(list);

        // Do write
        if (CollectionUtils.isNotEmpty(listForSave)) doWrite(listForSave);

        // Refresh pivot
        if (CollectionUtils.isNotEmpty(list)) setPivot(list.get(0));
    }

    public void doWrite(List<String> list) {

        if (CollectionUtils.isEmpty(list)) return;


        // Load all data from database
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        WordMapper wordMapper = session.getMapper(WordMapper.class);

        List<Word> wordList = wordMapper.selectByExample(null);


        if (CollectionUtils.isEmpty(wordList)) {
            // Insert all
            list.forEach(x -> {
                Word word = new Word();
                word.setName(x);
                word.setCount(1);
                wordMapper.insert(word);
            });
        } else {

            List<String> wordStrList = wordList.stream().map(Word::getName).toList();

            list.stream().forEach(
                    x -> {
                        // If data not exist , insert
                        if (!wordStrList.contains(x)) {
                            Word word = new Word();
                            word.setName(x);
                            word.setCount(1);
                            wordMapper.insert(word);
                        }
                        // Else if data exists , update by increase count column by 1
                        else {
                            WordExample wordExample = new WordExample();
                            wordExample.createCriteria().andNameEqualTo(x);
                            Word word = wordMapper.selectByExample(wordExample).get(0);
                            word.setCount(word.getCount() + 1);
                            wordMapper.updateByPrimaryKey(word);
                        }
                    }
            );
        }

        session.commit();
    }

    private String parseWord(String input) {
        return input.split(" ")[1];
    }

    @Override
    public void collect() {
        // Get data from history data
        List<String> list = readHistory();

        // Write data to database
        write(list);

    }
}
