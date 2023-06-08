package com.jack.factory;

import com.jack.model.question.Question;

public interface QuestionFactory {

    Question createFillDefinition(String word);

    Question createSelectDefinition(String word);

    Question createSelectWord(String definition);

}
