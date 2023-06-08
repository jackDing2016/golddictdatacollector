package com.jack.service;

import com.jack.client.MybatisClient;
import com.jack.dao.DefinitionMapper;
import com.jack.dao.WordMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;

public class DefinitionServiceImpl implements DefinitionService {

    @Override
    public void fillDefinition(String word, String definition) {

        if (StringUtils.isEmpty(word) || StringUtils.isEmpty(definition)) return;

        SqlSession sqlSession =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = sqlSession.getMapper(WordMapper.class);
        DefinitionMapper definitionMapper =
                sqlSession.getMapper(DefinitionMapper.class);

        // Now a word could only have one definition, so delete previous data first
        definitionMapper.deleteByWord(word);

        // insert
        definitionMapper.setDefinition(word, definition);

        sqlSession.commit();
        sqlSession.close();

    }
}
