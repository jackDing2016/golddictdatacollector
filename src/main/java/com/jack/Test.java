package com.jack;

import com.jack.concurrent.GoldenDictHistoryCollector;
import com.jack.model.Word;
import com.jack.service.HistoryService;
import com.jack.service.HistoryServiceImpl;
import com.jack.service.WordService;
import com.jack.service.WordServiceImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {

        new GoldenDictHistoryCollector(new HistoryServiceImpl()).start();

//        while (true) {
//            System.out.println("Enter start to start the GoldenDict Data Collect!");
//            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String a = bufferedReader.readLine();
//            System.out.println(a);
//
//            if ("start".equals(a)) {
//
//            }
//
//            if ("exit".equals(a)) {
//                System.out.println("Bye Baby");
//                break;
//            }
//        }
    }

}
