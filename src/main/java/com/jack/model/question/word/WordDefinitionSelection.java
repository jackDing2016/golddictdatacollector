package com.jack.model.question.word;

import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;

import java.util.List;

public class WordDefinitionSelection extends Question<WordVO> {

    private List<String> optionList;

    public WordDefinitionSelection(String description, List<String> optionList) {
        super(description);
        this.optionList = optionList;
    }

    @Override
    public String toString() {
        return "SelectDefinition{" +
                "description=" + this.getDescription() + " " +
                "optionList=" + optionList +
                '}';
    }
}
