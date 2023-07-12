package com.jack.service;

import com.jack.model.vo.WordVO;
import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;

public class WordServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void readHistory() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        List<String> list = historyService.readHistory();
        list.forEach(System.out::println);
    }

    @Test
    public void getRandomWord() throws Exception {
        WordServiceImpl wordService = new WordServiceImpl();
        Callable<String> callable = wordService::getRandomWord;
        System.out.println(callable.call());
    }

    @Test
    public void findWordVOListByRootNames() {
        WordService wordService = new WordServiceImpl();
        List<WordVO> wordVOList = wordService.findWordVOListByRootNames("pre", "ment");
        wordVOList.forEach(x -> System.out.println(x.getName()));
    }

    @Test
    public void getWordLanguage() {
        WordService wordService = new WordServiceImpl();
        System.out.println(wordService.getLanguage("じいｊ").getName());;
    }

}
