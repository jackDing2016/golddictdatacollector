package com.jack.factory;

import com.jack.model.question.FillDefinition;
import com.jack.model.question.Question;
import com.jack.model.question.SelectDefinition;
import com.jack.model.question.SelectWord;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class SimpleQuestionFactory implements QuestionFactory {

    @Override
    public Question createFillDefinition(String word) {
        if (StringUtils.isEmpty(word)) {
            word = "girl";
        }
        return new FillDefinition(word);
    }

    @Override
    public Question createSelectDefinition(String word) {
        if (StringUtils.isEmpty(word)) {
            word = "girl";
        }
        List<String> optionList = List.of("woman", "boy", "monkey", "kick");
        return new SelectDefinition(word, optionList);
    }

    @Override
    public Question createSelectWord(String definition) {

        if (StringUtils.isEmpty(definition)) {
            definition = "how describe your girlfriend";
        }

        List<String> optionList = List.of("woman", "boy", "monkey", "kick");

        return new SelectWord(definition, optionList);
    }
}
