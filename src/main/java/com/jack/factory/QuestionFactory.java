package com.jack.factory;

import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;

public interface QuestionFactory<T extends WordVO> {

    Question<T> createFillDefinition(T word);

    Question<T> createSelectDefinition(T word);

    Question<T> createSelectWord(T definition);

}
