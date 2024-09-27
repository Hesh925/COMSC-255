package org.hesh925.week2.as8;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import static org.hesh925.week2.as8.Statistics.*;

public class TestStatistics {
    private static final String DELIM = ",";
    public static void main(String[] args) {
        String out = "";
        String pat = "0.";
        String IN = JOptionPane.showInputDialog("Enter data values separated by commas");

        int precision = Integer.parseInt(JOptionPane.showInputDialog("Enter Precision"));

        for (int i = 0; i < precision; i++) {
            pat += "0";
        }
        DecimalFormat df = new DecimalFormat("0.0#");

        StringTokenizer st = new StringTokenizer(IN, DELIM);

        double[] data = new double[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) {
            data[i] = Double.parseDouble(st.nextToken().trim());
        }

        out += "Original Data: ";
        for (double d : data) {
            out += df.format(d) + " ";
        }

        out += "\n\nResults Using Instance Methods:\n\n" + instanceTest(data, pat);
        out += "\n\nResults Using Static Methods:\n\n" + staticTest(data, pat);



        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }

    private static String staticTest(double[] data, String p) {
        DecimalFormat df = new DecimalFormat("0.0#");
        String out = "\nSorted Data: ";
        for (double d : computeSortedData(data)) {
            out += df.format(d) + " ";
        }

        df.applyPattern(p);
        out += "\n\nComputed Values:";
        out += "\nMin Value: " + df.format(computeMin(data));
        out += "\nMax Value: " + df.format(computeMax(data));
        out += "\nMean:      " + df.format(computeMean(data));
        out += "\nMedian:    " + df.format(computeMedian(data));

        return out;
    }

    private static String instanceTest(double[] data, String p) {
        DecimalFormat df = new DecimalFormat("0.0#");
        Statistics stats = new Statistics(data);
        String out = "\nSorted Data: ";
        for (double d : stats.getSortedData()) {
            out += df.format(d) + " ";
        }

        df.applyPattern(p);
        out += "\n\nComputed Values:";
        out += "\nMin Value: " + df.format(stats.findMin());
        out += "\nMax Value: " + df.format(stats.findMax());
        out += "\nMean:      " + df.format(stats.findMean());
        out += "\nMedian:    " + df.format(stats.findMedian());

        return out;
    }

}
