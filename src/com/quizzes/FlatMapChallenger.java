package com.quizzes;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapChallenger {

    public static void main(String[] args) {
        Animal a1 = new Animal("Dinasaur", Set.of("Chicken", "Icecream"));
        Animal a2 = new Animal("Dog", Set.of("Bones", "Cheese Burger", "Soda"));
        
        List<String> collect = List.of(a1, a2).stream()
                .map(Animal::getFoods)
                .flatMap(Set::stream)
                .limit(4)
                .filter(x -> x.matches(".*"))
                .collect(Collectors.toList());
        
        collect.forEach(System.out::println);
    }

    static class Animal {
        private String name;
        private Set<String> foods;

        Animal(String name, Set<String> foods) {
            this.name = name;
            this.foods = foods;
        }

        Set<String> getFoods() {
            return foods;
        }

        public String getName() {
            return name;
        }
    }
}
