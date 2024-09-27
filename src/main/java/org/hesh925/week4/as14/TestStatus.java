package org.hesh925.week4.as14;

import javax.swing.*;

public class TestStatus {
    public static void main (String[] args) {
        Status[] statuses = new Status[6];
        statuses[0] = new Rectangle(3, 2);
        statuses[1] = new Rectangle(6, 4);
        statuses[2] = new Rectangle(30, 20);
        statuses[3] = new Sibling("Jack", 21, 130);
        statuses[4] = new Sibling("Judy", 24, 118);
        statuses[5] = new Student("1,John Adam,3,93,91,100");

        String out = "";
        for (Status status : statuses) {
            status.displayStatus();
            out += status.getStatus();
        }

        JOptionPane.showMessageDialog(null, out);

        System.exit(0);
    }
}
