package org.hesh925.week5.as20;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.hesh925.week5.as20.Exceptions.*;

public class GuessGame extends JFrame implements ActionListener {

    int TotalGuesses = 0, TotalGames = 0;

    private JPanel F_Main = new JPanel();
    private JPanel F_Top = new JPanel();
    private JPanel F_Bot = new JPanel();
    private JLabel Guess_Text = new JLabel("Enter guess between 1 and 7");

    private JTextField Guess_In = new JTextField(10);
    private JTextArea Out = new JTextArea(20, 40);

    private Guess guess = null;

    public GuessGame() {
        this.setContentPane(F_Main);
        BorderLayout bl = new BorderLayout();

        F_Main.setLayout(bl);
        F_Main.add(F_Top, BorderLayout.NORTH);
        F_Main.add(F_Bot, BorderLayout.CENTER);

        F_Top.setBackground(Color.green);
        F_Bot.setBackground(Color.BLUE);

        F_Top.add(Guess_Text);
        F_Top.add(Guess_In);

        JScrollPane jspMessage = new JScrollPane(Out);
        jspMessage.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspMessage.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        F_Bot.add(jspMessage);

        Guess_In.addActionListener(this);

        guess = new Guess();
    }


    public void actionPerformed(ActionEvent e) {
        String userGuess;
        if (e.getSource() == Guess_In) {
            userGuess = Guess_In.getText().trim();
            Guess_In.setText("");

            try {
                TotalGuesses++;
                guess.checkGuess(userGuess);
            } catch (GuessOutOfRangeException | GuessTooSmallException | GuessTooLargeException |
                     GuessNotWholeNumberException ex) {

                AppendMessage(userGuess + " - " + ex.getMessage());
                return;
            }

            AppendMessage(userGuess + " - " + "Correct Guess");
            TotalGames++;
            AppendMessage("\nTotal Guesses: " + TotalGuesses);
            AppendMessage("Total Games: " + TotalGames);
            AppendMessage("Average Guesses: " + (TotalGuesses / TotalGames));
            AppendMessage("\nNew Game Started. Enter Guess\n");
            guess = new Guess();

        }
    }

    protected void AppendMessage(String message) {
        Out.append(message + "\n");
        Out.setCaretPosition(Out.getDocument().getLength());
    }
}
