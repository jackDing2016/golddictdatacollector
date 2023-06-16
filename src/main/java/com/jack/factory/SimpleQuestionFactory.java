package com.jack.factory;

import com.jack.model.question.word.WordFillDefinition;
import com.jack.model.question.Question;
import com.jack.model.question.word.WordDefinitionSelection;
import com.jack.model.question.word.WordSelection;
import com.jack.model.vo.WordVO;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class SimpleQuestionFactory implements QuestionFactory<WordVO> {

//    @Override
//    public Question createFillDefinition(WordVO word) {
//        if (StringUtils.isEmpty(word)) {
//            word = "girl";
//        }
//        return new WordFillDefinition(word);
//    }
//
//    @Override
//    public Question createSelectDefinition(String word) {
//        if (StringUtils.isEmpty(word)) {
//            word = "girl";
//        }
//        List<String> optionList = List.of("woman", "boy", "monkey", "kick");
//        return new WordDefinitionSelection(word, optionList);
//    }
//
//    @Override
//    public Question createSelectWord(WordVO definition) {
//
//        if (StringUtils.isEmpty(definition)) {
//            definition = "how describe your girlfriend";
//        }
//
//        List<String> optionList = List.of("woman", "boy", "monkey", "kick");
//
//        return new WordSelection(definition, optionList);
//    }

    @Override
    public Question<WordVO> createFillDefinition(WordVO word) {
//        if (StringUtils.isEmpty(word)) {
//            word = "girl";
//        }
//        return new WordFillDefinition(word);
        return null;
    }

    @Override
    public Question<WordVO> createSelectDefinition(WordVO word) {
        return null;
    }

    @Override
    public Question<WordVO> createSelectWord(WordVO definition) {
        return null;
    }
}
