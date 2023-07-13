package com.jack.service;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jack.configuration.ProjectModuleConfiguration;
import com.jack.service.HistoryService;
import com.jack.service.HistoryServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class HistoryServiceImplTest {

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
    public void collectNoDataInDB() {

        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());

//        HistoryServiceImpl historyService = new HistoryServiceImpl(null);
        HistoryService historyService = injector.getInstance(HistoryService.class);
        historyService.setPivot(null);
        historyService.collect();
    }

    @Test
    public void collectHaveDataInDB() {

        HistoryServiceImpl historyService = new HistoryServiceImpl(null);

    }

    @Test
    public void collectNoPivotAndNoDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl(null);
        historyService.setPivot(null);
        /**
         * We implement  no data in database by deleting data in real db .
         * We can mock a null list for data in db later
         */

        historyService.collect();

    }

    @Test
    public void collectNoPivotAndHaveDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl(null);
        historyService.setPivot(null);
        historyService.collect();
    }

    @Test
    public void collectHavePivotAndNoDataInDB() {

    }

    @Test
    public void collectHavePivotAndHaveDataInDB() {
//        HistoryServiceImpl historyService = new HistoryServiceImpl(null);
        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
        HistoryService historyService = injector.getInstance(HistoryService.class);
        historyService.setPivot("sequence");
        historyService.collect();
    }

    @Test
    public void testSchedule() {
//        ExecutorService

    }

    @Test
    public void testGuice() {
        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
        HistoryService historyService = injector.getInstance(HistoryService.class);
        historyService.testGuice();
    }

}
