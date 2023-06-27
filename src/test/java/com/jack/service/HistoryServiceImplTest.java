package com.jack.service;

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
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        List<String> list = historyService.readHistory();
        list.forEach(System.out::println);
    }

    @Test
    public void collectNoDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        historyService.setPivot(null);
        historyService.collect();
    }

    @Test
    public void collectHaveDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();

    }

    @Test
    public void collectNoPivotAndNoDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        historyService.setPivot(null);
        /**
         * We implement  no data in database by deleting data in real db .
         * We can mock a null list for data in db later
         */

        historyService.collect();

    }

    @Test
    public void collectNoPivotAndHaveDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        historyService.setPivot(null);
        historyService.collect();
    }

    @Test
    public void collectHavePivotAndNoDataInDB() {

    }

    @Test
    public void collectHavePivotAndHaveDataInDB() {
        HistoryServiceImpl historyService = new HistoryServiceImpl();
        historyService.setPivot("mall");
        historyService.collect();
    }

    @Test
    public void testSchedule() {
//        ExecutorService

    }

}
