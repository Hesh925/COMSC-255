package org.hesh925.week2.as6;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestStatistics {
    private static DecimalFormat df = new DecimalFormat("0.0#");


    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter item count"));
        double[] data = new double[n];


        for (int i = 0; i < n; i++) {
            data[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter data value"));
        }


        Statistics s = new Statistics(data);


        StringBuilder out = new StringBuilder("Original Data:\n");
        for (double d : s.getOrigData()) {
            out.append(df.format(d)).append(" ");
        }
        out.append("\nSorted Data:\n");
        for (double d : s.getSortedData()) {
            out.append(df.format(d)).append(" ");
        }
        out.append("\nMin Value: ").append(df.format(s.findMin()));
        out.append("\nMax Value: ").append(df.format(s.findMax()));
        out.append("\nMean:      ").append(df.format(s.findMean()));
        out.append("\nMedian:    ").append(df.format(s.findMedian()));


        JOptionPane.showMessageDialog(null, out.toString());
        System.exit(0);
    }
}
