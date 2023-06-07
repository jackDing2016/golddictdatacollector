package com.jack.service;

import com.jack.model.question.Question;
import com.jack.model.question.SimpleQuestionFactory;
import org.junit.jupiter.api.Test;

public class SimpleQuestionFactoryTest {

    @Test
    public void createFillDefinitionTest() {
        SimpleQuestionFactory simpleQuestionFactory = new SimpleQuestionFactory();
        Question question = simpleQuestionFactory.createFillDefinition(null);
        System.out.println(question);
    }

    @Test
    public void createSelectDefinitionTest() {
        SimpleQuestionFactory simpleQuestionFactory = new SimpleQuestionFactory();
        Question question = simpleQuestionFactory.createSelectDefinition(null);
        System.out.println(question);
    }

    @Test
    public void createSelectWordTest() {
        SimpleQuestionFactory simpleQuestionFactory = new SimpleQuestionFactory();
        Question question = simpleQuestionFactory.createSelectWord(null);
        System.out.println(question);
    }

}
