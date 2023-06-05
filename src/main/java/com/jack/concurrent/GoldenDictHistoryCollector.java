package com.jack.concurrent;

import com.jack.service.HistoryService;
import com.jack.service.HistoryServiceImpl;

public class GoldenDictHistoryCollector implements Runnable {

    private HistoryService historyService;

    public GoldenDictHistoryCollector(HistoryService historyService) {
        this.historyService = historyService;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Collect data start.");
            historyService.collect();
            System.out.println("Collect data end.");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start() {
        HistoryService historyService1 = new HistoryServiceImpl();
        GoldenDictHistoryCollector goldenDictHistoryCollector
                = new GoldenDictHistoryCollector(historyService1);

        Thread thread = new Thread(goldenDictHistoryCollector);
        thread.start();
    }

}
