package com.quizzes;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIfChallenge {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(22);
        list.add(12);
        list.add(14);
        list.add(128);

        System.out.println(list);

        // Integer wrapper class cache is one byte. -128 to 127.
        // dungeonMasterAge is out of the cache range.
        Integer prestoAge = 14;
        Integer dungeonMasterAge = 128;

        list.removeIf(e -> e == new Integer(12)
                    || e == dungeonMasterAge
                    || e == prestoAge
                    || e.equals(new Integer(22)));

        System.out.println(list);
    }

}
