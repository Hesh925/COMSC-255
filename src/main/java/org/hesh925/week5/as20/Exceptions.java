package org.hesh925.week5.as20;

public class Exceptions {
    public static class GuessOutOfRangeException extends Exception {
        public GuessOutOfRangeException() {
            super("Guess Out Of Range");
        }
    }

    public static class GuessTooLargeException extends Exception {
        public GuessTooLargeException() {
            super("Guess Too Large");
        }
    }

    public static class GuessTooSmallException extends Exception {
        public GuessTooSmallException() {
            super("Guess Too Small");
        }
    }

    public static class GuessNotWholeNumberException extends Exception {
        public GuessNotWholeNumberException() {
            super("Guess Not Whole Number");
        }
    }
}
