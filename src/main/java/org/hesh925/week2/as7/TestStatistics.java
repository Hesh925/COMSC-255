package org.hesh925.week2.as7;

import org.hesh925.week2.as6.Statistics;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class TestStatistics {
    private static final String DELIM = ",";

    public static void main(String[] args) {
        String Pat = "0.";
        String IN = JOptionPane.showInputDialog("Enter data values separated by commas");

        int precision = Integer.parseInt(JOptionPane.showInputDialog("Enter Precision"));

        for (int i = 0; i < precision; i++) {
            Pat += "0";
        }
        DecimalFormat df = new DecimalFormat("0.0#");

        StringTokenizer st = new StringTokenizer(IN, DELIM);

        double[] data = new double[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) {
            data[i] = Double.parseDouble(st.nextToken().trim());
        }

        Statistics s = new Statistics(data);

        String out = "Original Data: ";
        for (double d : s.getOrigData()) {
            out += df.format(d) + " ";
        }
        out += "\nSorted Data: ";
        for (double d : s.getSortedData()) {
            out += df.format(d) + " ";
        }

        df.applyPattern(Pat);

        out += "\nComputed Values Displayed To " + precision + " Decimal Places:";

        out += "\nMin Value: " + df.format(s.findMin());
        out += "\nMax Value: " + df.format(s.findMax());
        out += "\nMean:      " + df.format(s.findMean());
        out += "\nMedian:    " + df.format(s.findMedian());


        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }
}
