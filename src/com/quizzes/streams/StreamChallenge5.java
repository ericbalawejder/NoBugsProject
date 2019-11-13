package com.quizzes.streams;

import java.util.List;

public class StreamChallenge5 {

    public static void main(String[] args) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 20), 
                new Jedi("Obiwan", 30), new Jedi("Quigon", 40));
        
        jediList.stream()
                .filter(jedi -> jedi.name.startsWith("Obi") || jedi.name.startsWith("Luke"))
                .filter(jedi -> jedi.name.startsWith("Quigon"))
                .map(Jedi::getAge)
                .filter(age -> age > 10)
                .forEach(System.out::println);
    }

    static class Jedi {
        private String name;
        private int age;

        Jedi(String name, int age) {
            this.age = age;
            this.name = name;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }

}
