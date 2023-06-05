package com.jack.model;

import com.jack.model.question.Question;

public abstract class Answer {

    private Question question;

    private Integer score;
    
    public Answer(Question question) {
        this.question = question;
    }
}
