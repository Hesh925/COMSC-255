package org.hesh925.week5.as19;

public class Exceptions {
    public static class IdNotWholeNumberException extends Exception {
        public IdNotWholeNumberException() {
            super("ID is not a whole number");
        }
    }

    public static class IdOutOfRangeException extends Exception {
        public IdOutOfRangeException() {
            super("ID is out of range");
        }
    }

    public static class NotSpecifiedException extends Exception {
        public NotSpecifiedException() {
            super("Name is not specified");
        }
    }

    public static class NotAlphabeticException extends Exception {
        public NotAlphabeticException() {
            super("Name is not alphabetic");
        }
    }
}
