package com.jack.service;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.jack.configuration.ProjectModuleConfiguration;
import com.jack.constatnt.LanguageEnum;
import com.jack.model.Word;
import com.jack.model.vo.WordVO;
import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordServiceImpl;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.Callable;

public class WordServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void readHistory() {
        HistoryServiceImpl historyService = new HistoryServiceImpl(null);
        List<String> list = historyService.readHistory();
        list.forEach(System.out::println);
    }

    @Test
    public void getRandomWord() throws Exception {
        WordServiceImpl wordService = new WordServiceImpl();
        Callable<String> callable = wordService::getRandomWord;
        System.out.println(callable.call());
    }

    @Test
    public void getRandomWordByLanguage() {
        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
        WordService wordService = injector.getInstance(WordService.class);
        System.out.println(wordService.getRandomWord(LanguageEnum.JAPANESE));
    }

    @Test
    public void findWordVOListByRootNames() {
        WordService wordService = new WordServiceImpl();
        List<WordVO> wordVOList = wordService.findWordVOListByRootNames("pre", "ment");
        wordVOList.forEach(x -> System.out.println(x.getName()));
    }

    @Test
    public void getWordLanguage() {
        WordService wordService = new WordServiceImpl();
        System.out.println(wordService.getLanguage("じいｊ").getName());
    }

    @Test
    public void saveWord() {
        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
        WordService wordService = injector.getInstance(WordService.class);
        Word word = new Word();
        word.setName("しみませ");
        word.setUpdateTime(LocalDateTime.now());
        word.setCreateTime(LocalDateTime.now());
        word.setCount(1);
        word.setWordLanguage(LanguageEnum.JAPANESE.getCode());
        wordService.save(word);
    }

}
