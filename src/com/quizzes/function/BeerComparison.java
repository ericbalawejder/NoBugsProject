package com.quizzes.function;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BeerComparison {
    public static void main(String... args) {
        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;

        Supplier<Integer> moeSupplier = () -> 5;
        Consumer<Object> homerConsumer = System.out::println;

        UnaryOperator<Integer> carlOperator = (c) -> Integer.valueOf(c);
        BinaryOperator<Integer> barneyOperator = Integer::sum;

        var beerSum = carlOperator.apply(5) + barneyOperator.apply(2, 2);

        System.out.println(moeSupplier.get());
        System.out.println(beerSum);
        homerConsumer.accept(isGreaterThan.apply(moeSupplier.get()).test(beerSum));
    }
}
