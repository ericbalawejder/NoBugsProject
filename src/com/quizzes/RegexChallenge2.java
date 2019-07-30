package com.quizzes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChallenge2 {

    public static void main(String[] args) {
        testRegex("lisa@gmail.com");
        testRegex("misterburns$gmail9net.com");
        testRegex("homer007_simpson@hotmail*com");
        testRegex("barney@???????(.com");
        testRegex("@&lenny%com");
        testRegex("flanders@duff.");
    }

    static void testRegex(final String message) {
        final String pattern = "^[A-Z0-9]*[@|$][&]?[a-z0-9]+.[a-z]{2,6}$";

        final Pattern compiledPattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = compiledPattern.matcher(message);

        if (matcher.find()) {
            System.out.println("Found value:" + matcher.group(0));
        } else {
            System.out.println("No match");
        }
    }
}
