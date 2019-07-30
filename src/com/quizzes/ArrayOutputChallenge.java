package com.quizzes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayOutputChallenge {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // This class will synchronize the remove method and will not throw an
        // exception.
        // List<String> list = new CopyOnWriteArrayList<>();

        list.add("Arya");
        list.add("Tyrion");
        list.add("Cersei");
        list.add("Daenerys");
        list.add("Jaime");

        // doProcessJava8(list);
        // doProcessStream(list);
        doProcessWithIterator(list);
        //doProcess(list);

        System.out.println(list.size());
    }

    // Fail fast. Throws an exception on a normal ArrayList.
    // Fix: Will work with CopyOnWriteArrayList<>().
    static void doProcess(List<String> list) {
        for (String character : list) {
            if (character.equals("Cersei")) {
                list.remove(character);
            }
        }
    }

    // With iterator using normal ArrayList<>().
    static void doProcessWithIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String character = iterator.next();

            if (character.equals("Cersei")) {
                iterator.remove();
            }
        }
    }

    // Java 8 with normal ArrayList<>()
    static void doProcessJava8(List<String> list) {
        list.removeIf(character -> character.equals("Cersei"));
    }

    // Will work on normal ArrayList<>().
    static void doProcessStream(List<String> list) {
        List<String> newList = new ArrayList<>();
        newList.addAll(list.stream().
                filter(character -> !character.equals("Cersei"))
                .collect(Collectors.toList()));
                list.clear();
                list.addAll(newList);
    }

}
