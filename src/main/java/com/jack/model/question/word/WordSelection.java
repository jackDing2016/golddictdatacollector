package com.jack.model.question.word;

import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;

import java.util.List;

public class WordSelection extends Question<WordVO> {

    private List<String> optionList;

    public WordSelection(String description, List<String> optionList) {
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
