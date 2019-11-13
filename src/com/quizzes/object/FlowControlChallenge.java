package com.quizzes.object;

public class FlowControlChallenge {

    public static void main(String[] args) {

        boolean isHomerFat;
        boolean isBartPrankster = false;

        int result = 0;

        if (isHomerFat = true || (isBartPrankster = true)) {
            result++;
            isHomerFat = false;
        }

        if (isHomerFat || isBartPrankster && (isBartPrankster = false || isHomerFat)) {
            result++;
        }

        if (!isHomerFat && !isBartPrankster) {
            result++;
        }

        System.out.println(String.valueOf(result) + isHomerFat + isBartPrankster);
    }

}
