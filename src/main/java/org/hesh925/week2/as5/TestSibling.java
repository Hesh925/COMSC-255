package org.hesh925.week2.as5;

import javax.swing.*;

public class TestSibling {
    public static void main(String[] args) {
        String out;


        Sibling s1 = GetUserInput();
        Sibling s2 = GetUserInput();
        Sibling s3 = GetUserInput();


        Sibling light, young;


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




        out  = "The Lightest Sibling: " + light.getName() + " " + light.getAge() + " " + light.getWeight() + "\n";
        out += "The Youngest Sibling: " + young.getName() + " " + young.getAge() + " " + young.getWeight() + "\n";


        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }


    private static Sibling GetUserInput() {
        String name;
        int age, weight;


        name = JOptionPane.showInputDialog("Enter name");


        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));


        weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));


        return new Sibling(name, age, weight);
    }


}

