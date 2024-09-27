package org.hesh925.week3.as10;

import javax.swing.*;

public class TestLeapDay {
    public static void main(String[] args) {
        int d, m, y, DayNum;
        String out;
        d = Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));

        LeapDay day = new LeapDay(d, m, y);
        DayNum = day.findDayNumber();

        out = "Day number for " + m + "/" + d + " is " + DayNum;
        JOptionPane.showMessageDialog(null, out);

        System.exit(0);
    }
}
