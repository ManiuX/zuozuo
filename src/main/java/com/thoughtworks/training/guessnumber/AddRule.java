package com.thoughtworks.training.guessnumber;

import java.util.List;
import java.util.stream.Collectors;

public class AddRule implements Rule {
    @Override
    public List<Integer> apply(List<Integer> result) {
        return result.stream()
                .map(s->s+2)
                .collect(Collectors.toList());
    }
}
