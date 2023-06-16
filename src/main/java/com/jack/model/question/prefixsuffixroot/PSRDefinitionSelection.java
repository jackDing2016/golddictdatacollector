package com.jack.model.question.prefixsuffixroot;

import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;

import java.util.List;

public class PSRDefinitionSelection extends Question<WordVO> {

    private List<String> optionList;

    public PSRDefinitionSelection(String description, List<String> optionList) {
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
