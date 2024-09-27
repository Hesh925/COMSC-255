package org.hesh925.week5.as20;
import org.hesh925.week5.as20.Exceptions.*;
import javax.swing.*;
public class Guess extends JFrame {
    private int numberToGuess;

    public Guess() {
        this.numberToGuess = ((int) (Math.random() * 7)) + 1;
    }

    public void checkGuess(int guess) throws GuessOutOfRangeException,
            GuessTooLargeException, GuessTooSmallException {

        if(guess <= 0 || guess > 7) {
            throw new GuessOutOfRangeException();
        } else if(guess < numberToGuess) {
            throw new GuessTooSmallException();
        } else if(guess > numberToGuess) {
            throw new GuessTooLargeException();
        }
    }

    public void checkGuess(String guess) throws GuessOutOfRangeException,
            GuessTooLargeException, GuessTooSmallException, GuessNotWholeNumberException {
        int guessInt;
        try {
            guessInt = Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            throw new GuessNotWholeNumberException();
        }
        checkGuess(guessInt);
    }
}
