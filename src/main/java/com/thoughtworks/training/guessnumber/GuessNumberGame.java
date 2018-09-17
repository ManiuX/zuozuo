package com.thoughtworks.training.guessnumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class GuessNumberGame {

    private final Rule[] rules;


    @Autowired
    public GuessNumberGame(Rule ...rules) {
        this.rules=rules;
    }

    public  String process(String input){
        String[] allNumber= input.split(" ");

        List<Integer> inputNumbers = Arrays.stream(allNumber)
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        List<Integer> outputNumbers=process(inputNumbers);

        return outputNumbers.stream()
                .map(i->i.toString())
                .collect(Collectors.joining(" "));
    }


    private List<Integer> process(List<Integer> inputNumbers){
        List<Integer> result=inputNumbers;
        for(Rule rule:rules){
           result=rule.apply(result);
        }
        return result;
    }


}
