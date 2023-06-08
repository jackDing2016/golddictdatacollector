package com.jack.service;

import com.jack.service.DefinitionServiceImpl;
import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;

public class DefinitionServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void fillDefinition() {
        DefinitionServiceImpl definitionService = new DefinitionServiceImpl();
        String word = "monkey";
        String definition = "a type of animal which like human being again";
        definitionService.fillDefinition(word, definition);
    }

}
