package com.jack.dao;

import com.jack.client.MybatisClient;
import com.jack.model.Word;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

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

}