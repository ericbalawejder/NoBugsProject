package com.quizzes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class InstanceOfChallenge<T> {

    T t;

    public static void main(String[] args) {
        if (null instanceof Object) {
            System.out.println("null is instance of object");
        }
        if (null instanceof AtomicInteger) {
            System.out.println("null is instance of AtomicInteger");
        }
        if (null instanceof StackOverflowError) {
            System.out.println("null is instance of StackOverflowError");
        }

        if (new ArrayList<>() instanceof Cloneable) {
            System.out.println("ArrayList instance of Clonable");
            if (new String() instanceof CharSequence) {
                System.out.println("String instance of CharSequence");
                if (new InstanceOfChallenge().t instanceof Object) {
                    System.out.println("Exception");
                }
            }
        }
    }

}
