package com.quizzes;

public class StringChallenge {

    public static void main(String[] args) {
        var jedi = "masterYoda";

        changeString(jedi);
        System.out.println(jedi);
        
        String obi = changeStringReference(jedi);
        System.out.println(obi);
    }

    static String changeString(String jedi) {
        jedi.replace(jedi, "darthVader");
        return jedi;
    }
    // Added method
    static String changeStringReference(String jedi) {
        String master = jedi.replace(jedi, "darthVader");
        return master;
    }

}
