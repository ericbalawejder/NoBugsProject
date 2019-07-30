package com.quizzes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionFactoriesChallenge {

    public static void main(String... doYourbest) {
        final Collection<Object> finalDcCharacters = new ArrayList<>();
        List<String> dcHeros = List.of();
        Set<String> dcVillians = Set.of();

        try {
            dcHeros.add("Deadpool");
        } catch (UnsupportedOperationException e) {
            System.out.println("No space for Marvel heros here! | ");
        }
        
        try {
            dcVillians.stream().collect(Collectors.toList()).add("Harley Quinn");
            finalDcCharacters.addAll(new ArrayList<>(dcVillians));
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            System.out.println("No space for villians");
            System.exit(0);
        }
        
        try {
            var villians = Set.copyOf(dcVillians);
            finalDcCharacters.addAll(List.of(villians, Set.of("Joker", "Riddler", "Joker")));
        } catch (IllegalArgumentException e) {
            System.out.println("Where are the villians?");
        }
        finalDcCharacters.forEach(System.out::println);
    }

}

