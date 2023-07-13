package com.jack.service;


import com.jack.model.Word;
import com.jack.model.vo.WordVO;

import java.util.List;

public interface WordService {

    void save(Word word);

    void update(Integer id);

    void setFavorite(Integer id);

    Word selectWord(Integer id);

    String getRandomWord();

    String getRandomWordWithNoDefinition();

    void deleteByWord(String word);

    List<WordVO> findWordVOListByRootNames(String... rootNames);

    void forTestGuice();

    List<Word> listAll();

    void increaseCount(String word);

}
