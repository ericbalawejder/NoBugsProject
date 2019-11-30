package com.quizzes.streams;

import java.util.List;
import java.util.stream.Stream;

public class JediStreamChallenger {

    public static void main(String... args) {

        List<String> jediList = List.of("Yoda", "Luke", "Anakin", "Obi Wan", "Luke");

        jediList.stream()
                .skip(1)
                .filter(jedi -> jedi.startsWith("Lu"))
                .limit(4)
                .distinct()
                .map(String::length)
                .flatMap(jedi -> Stream.of(jedi))
                .peek(System.out::println);


        // There is no terminal operation on the stream. Streams are lazy so the intermediate
        // operations do NOT get executed.

        // forEach(System.out::println) or collect(Collectors.toList()) are
        // examples of terminal operations
    }

}
