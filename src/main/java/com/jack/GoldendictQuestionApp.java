package com.jack;

import com.jack.concurrent.GoldenDictHistoryCollector;
import com.jack.factory.RandomQuestionFactory;
import com.jack.model.question.FillDefinition;
import com.jack.model.question.Question;
import com.jack.service.HistoryServiceImpl;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GoldendictQuestionApp {

    public static void main(String[] args) throws Exception {

//        // create Options object
//        Options options = new Options();
//
//        // add t option
//        options.addOption("t", false, "display current time");
//
//
//        CommandLineParser parser = new DefaultParser();
//        CommandLine cmd = parser.parse(options, args);
//
//        if (cmd.hasOption("t")) {
//            // print the date and time
//            System.out.println("print the date and time");
//        } else {
//            // print the date
//            System.out.println("print the date");
//        }

//        InputStream inputStream=System.in;

        out:
        while (true) {
            System.out.println("Please select a option, enter exit to exit");
            System.out.println("a Fill definition.");
            System.out.println("b Fill definition and save it.");
            System.out.println("c Do some selection question.");
            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if ("a".equals(input)) {
                System.out.println("Start fill definition, enter exit to exit");
                while (true) {
                    RandomQuestionFactory randomQuestionFactory = new RandomQuestionFactory();
                    Question fillDefinition = randomQuestionFactory.createFillDefinition(null);
                    System.out.println("Please write the definition of word \"" + fillDefinition.getDescription() + "\"");
                    String answer = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    if ("exit".equals(answer)) {
                        System.out.println("Have a good day. Bye Bye");
                        break out;
                    }
                    System.out.println("Your answer is \"" + answer + "\". OK Then we go on to the next one.");
                }
            }
        }

    }

}
