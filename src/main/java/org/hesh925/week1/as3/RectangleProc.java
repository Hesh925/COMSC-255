package org.hesh925.week1.as3;

import javax.swing.*;

public class RectangleProc {
    public static void main(String[] args) {

        double l, w, a, p;
        String out;

        l = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
        w = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle: "));

        out  = "Length: %s\n".formatted(l);
        out += "Width: %s\n".formatted(w);
        out += "Area: %s\n".formatted(computeArea(l, w));
        out += "Perimeter: %s".formatted(computePerim(l, w));

        JOptionPane.showMessageDialog(null, out);

        System.exit(0);
    }

    public static double computeArea(double l, double w) {
        // A = l * w
        return l * w;
    }

    public static double computePerim(double l, double w) {
        // P = 2(l + w)
        return 2 * (l + w);
    }
}
