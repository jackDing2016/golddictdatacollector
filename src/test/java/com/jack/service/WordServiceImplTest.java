package com.jack.service;

import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;

public class WordServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void readHistory() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        List<String> list = historyService.readHistory();
        list.forEach(System.out::println);
    }

    @Test
    public void getRandomWord() throws Exception {
        WordServiceImpl wordService = new WordServiceImpl();
        Callable<String> callable = wordService::getRandomWord;
        System.out.println(callable.call());
    }

}
