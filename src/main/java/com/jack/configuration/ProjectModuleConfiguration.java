package com.jack.configuration;

import com.google.inject.AbstractModule;
import com.jack.concurrent.GoldenDictHistoryCollector;
import com.jack.service.HistoryService;
import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordService;
import com.jack.service.WordServiceImpl;


public class ProjectModuleConfiguration extends AbstractModule {
    @Override
    protected void configure() {
//        super.configure();
        bind(WordService.class).to(WordServiceImpl.class);
        bind(HistoryService.class).to(HistoryServiceImpl.class);
        bind(Runnable.class).to(GoldenDictHistoryCollector.class);
    }
}
