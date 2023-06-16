package com.jack.factory;

import com.jack.client.MybatisClient;
import com.jack.dao.DefinitionMapper;
import com.jack.model.question.Question;
import com.jack.model.question.word.WordDefinitionSelection;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DatabaseQuestionFactory implements QuestionFactory<WordVO> {
//    @Override
//    public Question createFillDefinition(String word) {
//        return null;
//    }
//
//    @Override
//    public Question createSelectDefinition(String word) {
//
//        // get word definition
//        SqlSession session =
//                MybatisClient.getSqlSessionFactory().openSession();
//
//        DefinitionMapper definitionMapper = session.getMapper(DefinitionMapper.class);
//        String definition = definitionMapper.getDefinitionByWord(word);
//
//        // get 3 other definition which is not relate with the word randomly
//        List<String> definitionOptions = definitionMapper.getThreeDefinitionsRandom();
//        definitionOptions.add(definition);
//
//        session.close();
//
//        return new WordDefinitionSelection(word, definitionOptions);
//    }
//
//    @Override
//    public Question createSelectWord(WordVO definition) {
//        return null;
//    }

    @Override
    public Question<WordVO> createFillDefinition(WordVO word) {
        return null;
    }

    @Override
    public Question<WordVO> createSelectDefinition(WordVO word) {
        // get word definition
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        DefinitionMapper definitionMapper = session.getMapper(DefinitionMapper.class);
        String definition = definitionMapper.getDefinitionByWord(word.getName());

        // get 3 other definition which is not relate with the word randomly
        List<String> definitionOptions = definitionMapper.getThreeDefinitionsRandom();
        definitionOptions.add(definition);

        session.close();

        return new WordDefinitionSelection(word.getName(), definitionOptions);
    }

    @Override
    public Question<WordVO> createSelectWord(WordVO definition) {
        return null;
    }
}
