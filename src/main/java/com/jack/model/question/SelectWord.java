package com.jack.model.question;

import java.util.List;

public class SelectWord extends Question {

    private List<String> optionList;

    public SelectWord(String description, List<String> optionList) {
        super(description);
        this.optionList = optionList;
    }

    @Override
    public String toString() {
        return "SelectWord{" +
                "description=" + this.getDescription() + " " +
                "optionList=" + optionList +
                '}';
    }
}
