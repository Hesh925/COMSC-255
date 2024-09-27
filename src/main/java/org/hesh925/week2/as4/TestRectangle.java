package org.hesh925.week2.as4;

import javax.swing.*;

public class TestRectangle {
    public static void main(String[] args) {
        String out;
        Rectangle r1 = GetUserInput();
        Rectangle r2 = GetUserInput();


        out  = "First Rectangle:";
        out += "\nLength: " + r1.getLength();
        out += "\nWidth: " + r1.getWidth();
        out += "\nArea: " + r1.computeArea();
        out += "\nPerimeter: " + r1.computePerimeter() + "\n";


        out += "\nSecond Rectangle:";
        out += "\nLength: " + r2.getLength();
        out += "\nWidth: " + r2.getWidth();
        out += "\nArea: " + r2.computeArea();
        out += "\nPerimeter: " + r2.computePerimeter();


        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }


    private static Rectangle GetUserInput() {
        double l, w;
        l = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter length"));
        w = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter width"));
        return new Rectangle(l, w);
    }

}
