package org.hesh925.week3.as10;

import javax.swing.*;

public class TestDay {
    public static void main(String[] args) {
        int d, m, y, DayNum;
        String out;
        d = Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));

        Day day = new Day(d, m);
        DayNum = day.findDayNumber();

        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            DayNum++;
        }

        out = "Day number for " + m + "/" + d + " is " + DayNum;
        JOptionPane.showMessageDialog(null, out);

        System.exit(0);
    }
}
