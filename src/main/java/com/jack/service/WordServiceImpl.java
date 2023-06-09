package com.jack.service;

import com.jack.client.MybatisClient;
import com.jack.dao.WordMapper;
import com.jack.model.Word;
import com.jack.model.WordExample;
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

    @Override
    public void deleteByWord(String word) {
        SqlSession session = MybatisClient.getSqlSessionFactory().openSession();
        WordExample wordExample = new WordExample();
        wordExample.createCriteria().andNameEqualTo(word);
        session.getMapper(WordMapper.class).deleteByExample(wordExample);
        session.commit();
        session.close();
    }
}
