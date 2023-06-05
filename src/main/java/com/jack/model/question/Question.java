package com.jack.model.question;

public abstract class Question {

    private String description;


    public Question(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
