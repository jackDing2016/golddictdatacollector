package com.jack.model.question.prefixsuffixroot;

import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;

import java.util.List;

public class PSRSelection extends Question<WordVO> {
    private List<String> optionList;

    public PSRSelection(String description, List<String> optionList) {
        super(description);
        this.optionList = optionList;
    }

    @Override
    public String toString() {
        return "SelectWord{" + "description=" + this.getDescription() + " " + "optionList=" + optionList + '}';
    }
}
