package com.jack.factory;

import com.jack.model.question.Question;
import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;

public class PrefixSuffixRootQuestionFactory implements QuestionFactory<PrefixSuffixRootVO>{
    @Override
    public Question<PrefixSuffixRootVO> createFillDefinition(PrefixSuffixRootVO word) {
        return null;
    }

    @Override
    public Question<PrefixSuffixRootVO> createSelectDefinition(PrefixSuffixRootVO word) {
        return null;
    }

    @Override
    public Question<PrefixSuffixRootVO> createSelectWord(PrefixSuffixRootVO definition) {
        return null;
    }
}
