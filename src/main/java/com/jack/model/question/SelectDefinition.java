package com.jack.model.question;

import java.util.List;

public class SelectDefinition extends Question{

    private List<String> optionList;

    public SelectDefinition(String description, List<String> optionList) {
        super(description);
        this.optionList = optionList;
    }
}
