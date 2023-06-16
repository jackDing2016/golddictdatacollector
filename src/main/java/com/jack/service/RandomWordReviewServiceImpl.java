package com.jack.service;

import com.jack.client.MybatisClient;
import com.jack.dao.WordMapper;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RandomWordReviewServiceImpl implements WordReviewService<WordVO>, RandomDataService {
    @Override
    public List<WordVO> getWordVOList() {
        SqlSession sqlSession =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = sqlSession.getMapper(WordMapper.class);
        List<WordVO> wordVOList = wordMapper.getRandomWordVOList();
        sqlSession.close();
        return wordVOList;
    }
}
