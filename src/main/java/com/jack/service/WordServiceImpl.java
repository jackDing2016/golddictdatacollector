package com.jack.service;

import com.jack.client.MybatisClient;
import com.jack.constatnt.LanguageEnum;
import com.jack.dao.WordMapper;
import com.jack.model.Word;
import com.jack.model.WordExample;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.session.SqlSession;

import java.time.LocalDateTime;
import java.util.List;

public class WordServiceImpl implements WordService {
    @Override
    public void save(Word word) {

        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        WordMapper wordMapper = session.getMapper(WordMapper.class);

        word.setCreateTime(LocalDateTime.now());
        word.setUpdateTime(LocalDateTime.now());
        wordMapper.insert(word);
        session.commit();
        session.close();
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
        String word = session.getMapper(WordMapper.class).getRandomWord();
        session.close();
        return word;
    }

    @Override
    public String getRandomWordWithNoDefinition() {
        return null;
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

    @Override
    public List<WordVO> findWordVOListByRootNames(String... rootNames) {
        SqlSession session = MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);
        List<WordVO> wordVOList = wordMapper.getWordVOList(List.of(rootNames));
        session.close();
        return wordVOList;
    }

    @Override
    public LanguageEnum getLanguage(String word) {
//        Character charSequence = word.charAt(0);

        boolean hasJapanese = false;
//        for (char c : charSequence.toString().toCharArray()) {
        for (char c : word.toCharArray())

//            if (Character.UnicodeBlock.of(c) != Character.UnicodeBlock.BASIC_LATIN) {
//                return LanguageEnum.ENGLISH;
//            }
            if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                    || Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HIRAGANA
                    || Character.UnicodeBlock.of(c) == Character.UnicodeBlock.KATAKANA
                    || Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                    || Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                    || Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION) {
                return LanguageEnum.JAPANESE;
            }

        return LanguageEnum.ENGLISH;
    }

    @Override
    public void forTestGuice() {
        System.out.println("If you see me that means it is successful.");
    }

    @Override
    public List<Word> listAll() {
        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();

        WordMapper wordMapper = session.getMapper(WordMapper.class);

        List<Word> wordList = wordMapper.selectByExample(null);
        session.close();
        return wordList;
    }

    @Override
    public void increaseCount(String word) {

        SqlSession session =
                MybatisClient.getSqlSessionFactory().openSession();
        WordMapper wordMapper = session.getMapper(WordMapper.class);

        WordExample wordExample = new WordExample();
        wordExample.createCriteria().andNameEqualTo(word);
        Word wordObj = wordMapper.selectByExample(wordExample).get(0);
        wordObj.setCount(wordObj.getCount() + 1);
        wordObj.setUpdateTime(LocalDateTime.now());
        wordMapper.updateByPrimaryKey(wordObj);
        session.commit();
        session.close();
    }
}
