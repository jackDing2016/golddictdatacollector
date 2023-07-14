package com.jack;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jack.concurrent.GoldenDictHistoryCollector;
import com.jack.configuration.ProjectModuleConfiguration;
import com.jack.service.HistoryService;
import com.jack.service.HistoryServiceImpl;
import org.apache.commons.collections.collection.PredicatedCollection;

public class GoldendictDataCollectorApp {

    public static void main(String[] args) throws Exception {

//        new GoldenDictHistoryCollector(new HistoryServiceImpl(null)).start();

        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
        Runnable goldenDictHistoryCollector = injector.getInstance(GoldenDictHistoryCollector.class);
        new Thread(goldenDictHistoryCollector).start();

//        Injector injector = Guice.createInjector(new ProjectModuleConfiguration());
//        HistoryService historyService = injector.getInstance(HistoryService.class);
//        historyService.testGuice();




//        String env = System.getProperty("jack_env");

//        System.out.println(env);

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
