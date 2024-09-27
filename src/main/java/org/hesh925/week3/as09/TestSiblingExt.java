package org.hesh925.week3.as09;

import javax.swing.*;

public class TestSiblingExt {
    public static void main(String[] args) {
        String out, name;
        int age, weight, height;

        //name = JOptionPane.showInputDialog("Enter name");
        //age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        //weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
        //height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        final SiblingExt s1 = new SiblingExt("Jack", 21, 130, 69);

        //name = JOptionPane.showInputDialog("Enter name");
        //age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        //weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
        //height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        final SiblingExt s2 = new SiblingExt("Judy", 24, 118, 63);

        //name = JOptionPane.showInputDialog("Enter name");
        //age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        //weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
        //height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        final SiblingExt s3 = new SiblingExt("John", 26, 145, 70);


        SiblingExt light, young, tall;


        if (s1.getWeight() < s2.getWeight() && s1.getWeight() < s3.getWeight()) {
            light = s1;
        } else if (s2.getWeight() < s1.getWeight() && s2.getWeight() < s3.getWeight()) {
            light = s2;
        } else {
            light = s3;
        }


        if (s1.getAge() < s2.getAge() && s1.getAge() < s3.getAge()) {
            young = s1;
        } else if (s2.getAge() < s1.getAge() && s2.getAge() < s3.getAge()) {
            young = s2;
        } else {
            young = s3;
        }

        if (s1.getHeight() > s2.getHeight() && s1.getHeight() > s3.getHeight()) {
            tall = s1;
        } else if (s2.getHeight() > s1.getHeight() && s2.getHeight() > s3.getHeight()) {
            tall = s2;
        } else {
            tall = s3;
        }

        out  = "The Youngest Sibling: " + young.getName() + " " + young.getAge() + " " + young.getWeight() + " " + young.getHeight() + "\n";
        out += "The Lightest Sibling: " + light.getName() + " " + light.getAge() + " " + light.getWeight() + " " + light.getHeight() + "\n";
        out += "The Tallest Sibling: " + tall.getName() + " " + tall.getAge() + " " + tall.getWeight() + " " + tall.getHeight() + "\n";
        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }
}

