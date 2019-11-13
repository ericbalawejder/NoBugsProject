package com.quizzes.streams;

import java.util.stream.IntStream;

public class StreamChallenge8 {

    // The trick in dropWhile and takeWhile is if the condition is not met, the method breaks.
    public static void main(String...doYourBest) {
        IntStream.iterate(10, i -> i - 2)
                 .limit(5)
                 .skip(1)
                 .dropWhile(i -> i < 6) // break
                 .sorted()
                 .takeWhile(i -> i > 2) // break
                 .forEach(System.out::println);
    }

}
