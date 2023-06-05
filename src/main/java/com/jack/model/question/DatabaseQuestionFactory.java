package com.jack.model.question;

public class DatabaseQuestionFactory implements QuestionFactory{
    @Override
    public Question createFillDefinition(String word) {
        return null;
    }

    @Override
    public Question createSelectDefinition(String word) {
        return null;
    }

    @Override
    public Question createSelectWord(String definition) {
        return null;
    }
}
