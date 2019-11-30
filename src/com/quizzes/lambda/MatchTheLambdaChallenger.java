package com.quizzes.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MatchTheLambdaChallenger {

    public static void main(String... args) {

        Supplier<String> moeBeerSupplier = () -> "Darth Vader";
        Supplier<String> methodReferenceMoeBeerSupplier = String::new;

        Predicate<String> beerQualityTest = jedi -> jedi.equals("jedi");
        Predicate<String> methodReferenceBeerQualityTest = String::isEmpty;

        Consumer<String> beerConsumer = saber -> System.out.printf("Moe uses the " + saber);
        Consumer<String> methodRefernceBeerConsumer = System.out::println;

        Function<String, String> beerProcessor = jedi -> jedi.concat(jedi);
        Function<String, String> methodReferenceBeerProcessor = String::toUpperCase;

        BiFunction<String, String, Object> biBeerProcessor = (x, y) -> x + y;
        BiFunction<String, String, Object> methodReferenceBiBeerProcessor = String::compareTo;

        UnaryOperator<String> pureUniBeerProcessor = homer -> homer.concat("Marge");
        UnaryOperator<Integer> methodReferencePureUniBeerProcessor = Integer::valueOf;

        BinaryOperator<Double> pureBiBeerProcessor = (x, y) -> x + y;
        BinaryOperator<Double> methodReferenceBiPureBeerProcessor = Double::max;
    }

}
