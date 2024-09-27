package org.hesh925.week1.as2;

import javax.swing.*;

public class Average {
    public static void main(String[] args) {

        // Declare variables
        String msg;
        double average = 0, sum = 0;
        double[] UserIn = new double[3];

        // Get user input
        UserIn[0] = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        UserIn[1] = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
        UserIn[2] = Double.parseDouble(JOptionPane.showInputDialog("Enter the third number: "));

        // Calculate sum
        for (double num : UserIn) {
            sum += num;
        }

        // Calculate average
        average = sum / UserIn.length;

        // Create message
        msg = "The sum of " + UserIn[0] + ", " + UserIn[1] + ", and " + UserIn[2] + " is " + sum + ".\n";
        msg += "The average of " + UserIn[0] + ", " + UserIn[1] + ", and " + UserIn[2] + " is " + average + ".";

        // Display message
        JOptionPane.showMessageDialog(null, msg);

        // Exit program gracefully
        System.exit(0);
    }
}
