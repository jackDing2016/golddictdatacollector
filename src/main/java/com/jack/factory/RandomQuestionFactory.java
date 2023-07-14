package com.jack.factory;

import com.jack.client.MybatisClient;
import com.jack.constatnt.LanguageEnum;
import com.jack.dao.WordMapper;
import com.jack.model.question.word.WordFillDefinition;
import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.session.SqlSession;

public class RandomQuestionFactory implements QuestionFactory<WordVO> {

    private int weight;

//    @Override
//    public Question createFillDefinition(String word) {
//
//        SqlSession session =
//                MybatisClient.getSqlSessionFactory().openSession();
//        WordMapper wordMapper = session.getMapper(WordMapper.class);
//
//        String randomWord = wordMapper.getRandomWord();
//
//        session.close();
//
//        return new WordFillDefinition(randomWord);
//    }
//
//    @Override
//    public Question createSelectDefinition(String word) {
//        return null;
//    }
//
//    @Override
//    public Question createSelectWord(WordVO definition) {
//        return null;
//    }

    @Override
    public Question<WordVO> createFillDefinition(WordVO word) {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);

        String randomWord = wordMapper.getRandomWord(LanguageEnum.ENGLISH.getCode());

        session.close();

        return new WordFillDefinition(randomWord);
    }

    @Override
    public Question<WordVO> createSelectDefinition(WordVO word) {
        return null;
    }

    @Override
    public Question<WordVO> createSelectWord(WordVO definition) {
        return null;
    }
}
