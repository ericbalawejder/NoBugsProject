package com.quizzes.object;

import java.util.Arrays;

public class BinarySearchChallenge {

    static String[] marvel = {"Spiderman", "Venom", "Carnage", "Mysterig"};

    public static void main(String... args) {
        Arrays.sort(marvel);

        System.out.println(Arrays.binarySearch(marvel, "Xavier"));
        System.out.println(marvel[Arrays.binarySearch(marvel, "Carnage")]);
        System.out.println(Arrays.binarySearch(marvel, "Lizard"));
        System.out.println(Arrays.binarySearch(marvel, "Apocalypse"));
        System.out.println(Arrays.binarySearch(marvel, "Spiderman"));


        /*
        -4 - 1 = -5
        "Carnage"
        -2
        -1
        2
         */
    }
}
