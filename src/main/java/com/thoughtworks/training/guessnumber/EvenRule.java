package com.thoughtworks.training.guessnumber;

import java.util.List;
import java.util.stream.Collectors;

public class EvenRule implements Rule {

    @Override
    public List<Integer> apply(List<Integer> result) {
        return result.stream()
                .filter(s->s%2==0)
                .collect(Collectors.toList());
    }
}
