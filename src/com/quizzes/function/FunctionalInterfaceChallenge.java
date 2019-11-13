package com.quizzes.function;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfaceChallenge {

    static BiFunction<Integer, Integer, Integer> heisenberg = (a, b) -> a + b;

    static Function<Integer, Integer> jesse = a -> a - 2;

    static BiFunction<Integer, Integer, Integer> saul = heisenberg.andThen(jesse);

    //                                                                   trick  ((a + 2) / (b + 2))
    static BiConsumer<Integer, Integer> gustavo = (a, b) -> System.out.println(a + 2 / b + 2);

    public static void main(String[] breakingBad) {
        var firstLaunder = saul.apply(2, 2);
        System.out.println(firstLaunder);

        heisenberg.andThen(jesse);

        var secondLaunder = heisenberg.apply(2, 2);
        System.out.println(secondLaunder);

        gustavo.accept(firstLaunder, secondLaunder);
    }

}
