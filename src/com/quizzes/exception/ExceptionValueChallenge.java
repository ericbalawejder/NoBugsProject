package com.quizzes.exception;

public class ExceptionValueChallenge {

    static int kratos, zeus, hades;

    public static void main(String[] args) {
        try {
            invokeAGod(kratos = 1, lightningOfZeus(zeus = 2), hades = 3);
        } catch (Exception e) {
            System.out.println(kratos + " " + zeus + " " + hades);
        }
    }

    static int lightningOfZeus(int i) throws Exception {
        throw new StackOverflowError("Wooooww!");
        //throw new Exception("Wooooww!");
    }

    static int invokeAGod(int a, int b, int c) {
        return a + b + c;
    }

}
