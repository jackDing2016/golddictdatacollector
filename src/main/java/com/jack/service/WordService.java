package com.jack.service;


import com.jack.model.Word;

public interface WordService {

    void save(Word word);

    void update(Integer id);

    void setFavorite(Integer id);

    Word selectWord(Integer id);

}
