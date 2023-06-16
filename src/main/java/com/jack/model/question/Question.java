package com.jack.model.question;

import com.jack.model.vo.WordVO;

public abstract class Question<T extends WordVO> {

    private T t;

    private String description;

    private String answer;

    private String solution;


    public Question(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
