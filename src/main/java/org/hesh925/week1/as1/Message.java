package org.hesh925.week1.as1;

import javax.swing.JOptionPane;

public class Message {
    public static void main(String[] args) {
        String msg = "Today is a good day.\n";
        msg += "I am learning Java programming.\n";
        msg += "It's a lot of fun.\n"; // weird unicode character here

        JOptionPane.showMessageDialog(null, msg);
    }
}
