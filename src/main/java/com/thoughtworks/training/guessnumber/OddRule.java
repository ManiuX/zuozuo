package com.thoughtworks.training.guessnumber;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OddRule implements Rule {
    @Override
    public List<Integer> apply(List<Integer> result) {
        return result.stream()
                .filter(s->s%2!=0)
                .collect(Collectors.toList());
    }
}
