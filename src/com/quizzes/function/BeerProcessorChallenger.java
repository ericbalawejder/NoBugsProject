package com.quizzes.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class BeerProcessorChallenger {

    private static int drunkenness;

    public static void main(String... args) {

        Supplier<Integer> moeBeerSupplier = () -> drunkenness = 5;
        //drunkenness = 10;
        Function<Integer, Integer> processBeer = beerProcessor -> drunkenness = (beerProcessor + 2);

        Consumer<Integer> homerBeerConsumer = System.out::println;
        homerBeerConsumer.accept(moeBeerSupplier.get() + processBeer.apply(drunkenness));
        //homerBeerConsumer.accept(processBeer.apply(drunkenness));
    }
}
