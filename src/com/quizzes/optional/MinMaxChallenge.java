package com.quizzes.optional;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxChallenge {

    public static void main(String[] args) {
        IntStream intStream = List.of(1, 2, 3, 4, 5, 6)
                .stream().mapToInt(n -> n);
        
        //intStream.forEach(System.out::println);
        
        IntStream intStream2 = intStream;
        
        //intStream2.forEach(System.out::println);
        
        OptionalInt optIntMin = intStream.min();
        OptionalInt optIntMax = intStream2.max();
        
        int sum = optIntMax.orElse(5) + optIntMin.orElse(5);
        
        System.out.println(sum);
    }

}
