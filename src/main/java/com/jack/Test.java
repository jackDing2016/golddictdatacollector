package com.jack;

import com.jack.concurrent.GoldenDictHistoryCollector;
import com.jack.service.HistoryServiceImpl;

import javax.swing.table.TableRowSorter;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws Exception {

        new GoldenDictHistoryCollector(new HistoryServiceImpl()).start();

//        Runnable goldenDictHistoryCollector = new GoldenDictHistoryCollector(new HistoryServiceImpl());
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<?> future = executorService.submit(goldenDictHistoryCollector);
//        try {
//            future.get(5000, TimeUnit.MILLISECONDS);
//        } catch (TimeoutException e) {
//            System.out.println("Time out");
//            future.cancel(true);
//        }

//        System.out.println(System.getenv("jack_env"));


    }

}
