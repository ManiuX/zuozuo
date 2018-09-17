package com.thoughtworks.training.guessnumber;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringAppRunner implements ApplicationRunner {
    @Autowired
    private GuessNumberGame guessNumberGame;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(guessNumberGame.process("1 2 3 4"));
        guessNumberGame.process("1 2 3 4");
    }


}
