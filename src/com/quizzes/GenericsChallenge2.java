package com.quizzes;

public class GenericsChallenge2 {

    @SuppressWarnings("unchecked")
    public static void main(String... doYourbest) {

        @SuppressWarnings("rawtypes")
        Archer archer = new Archer();

        archer.attack("->");
        archer.attack(Double.valueOf(1.0));
        archer.attack(Float.valueOf(1));
    }

    static class Archer<T> {
        T t;

        void attack(T t) {
            //this.t = t;
            System.out.println(this.t);
            //System.out.println(t);
        }
    }

}
