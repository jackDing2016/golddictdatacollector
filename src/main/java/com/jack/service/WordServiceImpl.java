package com.jack.service;

import com.jack.client.MybatisClient;
import com.jack.dao.WordMapper;
import com.jack.model.Word;
import org.apache.ibatis.session.SqlSession;

public class WordServiceImpl implements WordService {
    @Override
    public void save(Word word) {

        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        WordMapper wordMapper = session.getMapper(WordMapper.class);
        wordMapper.insert(word);

    }

    @Override
    public void update(Integer id) {
        System.out.println("update method");
    }

    @Override
    public void setFavorite(Integer id) {

    }

    @Override
    public Word selectWord(Integer id) {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        WordMapper wordMapper = session.getMapper(WordMapper.class);
//        return wordMapper.selectWord(id);
        return wordMapper.selectTest();
    }

    @Override
    public String getRandomWord() {
        SqlSession session = MybatisClient.getSqlSessionFactory().openSession();
        return session.getMapper(WordMapper.class).getRandomWord();
    }
}
