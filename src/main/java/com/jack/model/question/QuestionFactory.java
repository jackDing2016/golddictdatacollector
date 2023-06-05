package com.jack.model.question;

public interface QuestionFactory {

    Question createFillDefinition(String word);

    Question createSelectDefinition(String word);

    Question createSelectWord(String definition);

}
