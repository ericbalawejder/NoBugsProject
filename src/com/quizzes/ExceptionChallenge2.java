package com.quizzes;

import java.io.Closeable;

public class ExceptionChallenge2 {

    public static void main(String[] args) {
        String soprano = null;

        CloseIt closeIt = new CloseIt();
        CloseIt2 closeIt2 = new CloseIt2();

        try (closeIt) {
            System.out.println(soprano.matches(null));
        } catch (RuntimeException r) {
            try (closeIt2) {
                System.out.println("runtime");

                throw new StackOverflowError();
            } catch (Exception e) {
                System.out.println("exception");
            }
        } catch (Error exception) {
            System.out.println("error");
        } catch (Throwable throwable) {
            System.out.println("throwable");
        }
    }

    static class CloseIt implements Closeable {

        public void close() {
            System.out.println("close");
        }
    }
    
    static class CloseIt2 implements Closeable {

        public void close() {
            System.out.println("close2");
        }
    }

}
