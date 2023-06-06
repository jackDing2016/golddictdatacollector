package com.jack.model.question;

import com.jack.client.MybatisClient;
import com.jack.dao.DefinitionMapper;
import com.jack.dao.WordMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DatabaseQuestionFactory implements QuestionFactory {
    @Override
    public Question createFillDefinition(String word) {
        return null;
    }

    @Override
    public Question createSelectDefinition(String word) {

        // get word definition
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        DefinitionMapper definitionMapper = session.getMapper(DefinitionMapper.class);
        String definition = definitionMapper.getDefinitionByWord(word);

        // get 3 other definition which is not relate with the word randomly
        List<String> definitionOptions = definitionMapper.getThreeDefinitionsRandom();
        definitionOptions.add(definition);

        session.close();

        return new SelectDefinition(word, definitionOptions);
    }

    @Override
    public Question createSelectWord(String definition) {
        return null;
    }
}
