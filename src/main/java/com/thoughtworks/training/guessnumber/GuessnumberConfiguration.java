//package com.thoughtworks.training.guessnumber;
//
//import com.google.common.collect.ImmutableList;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GuessnumberConfiguration implements ApplicationContextAware {
//    private ApplicationContext applicationContext;
//
//    @Bean
//    public GuessNumberGame guessNumberGame(){
//        Rule rule=applicationContext.getBean(Rule.class);
//        return new GuessNumberGame((Rule) ImmutableList.of(rule));
//    }
//
//    @Bean
//    public Rule rule(){return new OddRule()}
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext=applicationContext;
//
//    }
//}
