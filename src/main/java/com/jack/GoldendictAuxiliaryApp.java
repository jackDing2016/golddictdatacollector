package com.jack;

import com.jack.factory.RandomQuestionFactory;
import com.jack.model.question.Question;
import com.jack.model.vo.WordVO;
import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;
import com.jack.service.DefinitionServiceImpl;
import com.jack.service.PrefixSuffixRootReviewServiceImpl;
import com.jack.service.RandomWordReviewServiceImpl;
import com.jack.service.WordServiceImpl;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GoldendictAuxiliaryApp {

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
            System.out.println("d Word definition review.");
            System.out.println("e Prefix,Suffix,Root definition review.");
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
            } else if ("b".equals(input)) {
                System.out.println("Start fill definition and save it, enter exit to exit and delete to delete the word");
                while (true) {
                    String word = new WordServiceImpl().getRandomWord();
                    System.out.println("Please write the definition of word \"" + word + "\"");
                    String answer = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    if ("exit".equals(answer)) {
                        System.out.println("Have a good day. Bye Bye");
                        break out;
                    } else if ("delete".equals(answer)) {
                        // delete the word
                        new WordServiceImpl().deleteByWord(word);
                        System.out.println("The word: \"" + word + "\" deleted.  Then we go on to the next one.");
                    } else {
                        // save it
                        new DefinitionServiceImpl().fillDefinition(word, answer);
                        System.out.println("Saved the answer: \"" + answer + "\". OK Then we go on to the next one.");
                    }

                }
            } else if ("d".equals(input)) {
                System.out.println("Starting word definition review.");
                while (true) {
                    List<WordVO> wordVOList = new RandomWordReviewServiceImpl().getWordVOList();
                    wordVOList.forEach(
                            x -> {
                                System.out.println(x.getName());
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                try {
                                    if (x.getDefinitionVO() == null || StringUtils.isEmpty(x.getDefinitionVO().getName())) {
                                        System.out.println("Definition to be filled");
                                    } else {
                                        System.out.println(x.getDefinitionVO().getName());
                                    }
                                    Thread.sleep(1000);
                                } catch (RuntimeException e) {
                                    System.out.println("Definition to be filled");
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                    );
                    System.out.println("Review ended. Enter anything to go on or enter exit to exit");
                    String inputTwo = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    if ("exit".equals(inputTwo)) {
                        System.out.println("Have a good day. Bye Bye");
                        break out;
                    }
                }
            } else if ("e".equals(input)) {
                System.out.println("Starting prefix,suffix,root definition review.");
                while (true) {
                    List<PrefixSuffixRootVO> wordVOList = new PrefixSuffixRootReviewServiceImpl().getWordVOList();
                    AtomicInteger lineCount = new AtomicInteger(10);
                    wordVOList.forEach(
                            x -> {
                                System.out.print(x.getName() + "  ");
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                try {
                                    if (x.getDefinitionVO() == null || StringUtils.isEmpty(x.getDefinitionVO().getName())) {
                                        System.out.print("Definition to be filled" + "  ");
                                    } else {
                                        System.out.print(x.getDefinitionVO().getName() + "|||  ");
                                    }
                                    Thread.sleep(500);
                                } catch (RuntimeException e) {
                                    System.out.println("Definition to be filled");
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                lineCount.getAndIncrement();
                                if (lineCount.get() % 5 == 0) {
                                    System.out.println();
                                }

                            }
                    );
                    System.out.println("Review ended. Enter anything to go on or enter exit to exit");
                    String inputTwo = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    if ("exit".equals(inputTwo)) {
                        System.out.println("Have a good day. Bye Bye");
                        break out;
                    }
                }
            }
        }

    }

}
