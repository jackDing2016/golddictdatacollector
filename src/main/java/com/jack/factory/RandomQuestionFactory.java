package com.jack.factory;

import com.jack.client.MybatisClient;
import com.jack.dao.WordMapper;
import com.jack.model.question.FillDefinition;
import com.jack.model.question.Question;
import org.apache.ibatis.session.SqlSession;

public class RandomQuestionFactory implements QuestionFactory {

    private int weight;

    @Override
    public Question createFillDefinition(String word) {

        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);

        String randomWord = wordMapper.getRandomWord();

        session.close();

        return new FillDefinition(randomWord);
    }

    @Override
    public Question createSelectDefinition(String word) {
        return null;
    }

    @Override
    public Question createSelectWord(String definition) {
        return null;
    }
}
