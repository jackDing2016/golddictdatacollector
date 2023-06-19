package com.jack.dao;

import com.jack.client.MybatisClient;
import com.jack.model.Word;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class WordMapperTest {

    @Test
    public void insert() {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);
        Word word = new Word();
        word.setCount(1);
        word.setName("word");
        word.setCreateTime(LocalDateTime.now());
        word.setUpdateTime(LocalDateTime.now());
        wordMapper.insert(word);
        session.commit();
        session.close();
    }

    @Test
    public void updateByPrimaryKey() {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);
        Word word = wordMapper.selectByPrimaryKey(295);
        word.setCount(word.getCount() + 1);
        word.setUpdateTime(LocalDateTime.now());
        wordMapper.updateByPrimaryKey(word);
        session.commit();
        session.close();
    }

    @Test
    public void getRandomWordVOList() {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);
        List<WordVO> wordVOList = wordMapper.getRandomWordVOList();
        session.close();
        System.out.println(wordVOList);
    }

    @Test
    public void getWordVOList() {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);
        List<WordVO> wordVOList = wordMapper.getWordVOList(List.of("ment", "pre"));
        session.close();
        System.out.println(wordVOList);

        wordVOList.forEach(x -> System.out.println(x.getName()));
    }

}
