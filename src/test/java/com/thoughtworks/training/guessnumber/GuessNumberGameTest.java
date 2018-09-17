package com.thoughtworks.training.guessnumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GuessNumberGameTest {

    @Autowired
    private GuessNumberGame guessNumberGame;
    @Test
    public void shouldRunTest(){
        assertThat(guessNumberGame.process("1 2 3 4 5"),is("1 3 5"));
    }
}