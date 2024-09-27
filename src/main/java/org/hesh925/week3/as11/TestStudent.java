package org.hesh925.week3.as11;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class TestStudent {


    public static void main(String[] args) {
        String outA="", outB="", outC="", outD="", outF="";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students", 10));

        Student students[] = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student(JOptionPane.showInputDialog("Enter student info"));
        }

        for(Student s: students){
            String grade = s.getFinalGrade();
            if(grade == "A") {
                outA += s.getId() + " " + s.getName() + " (" + s.getFinalGrade() + ")\n";
            } else if(grade == "B") {
                outB += s.getId() + " " + s.getName() + " (" + s.getFinalGrade() + ")\n";
            } else if(grade == "C") {
                outC += s.getId() + " " + s.getName() + " (" + s.getFinalGrade() + ")\n";
            } else if(grade == "D") {
                outD += s.getId() + " " + s.getName() + " (" + s.getFinalGrade() + ")\n";
            } else {
                outF += s.getId() + " " + s.getName() + " (" + s.getFinalGrade() + ")\n";
            }
        }
        String outAll= outA + outB + outC + outD + outF;
        JOptionPane.showMessageDialog(null, outAll);
        System.exit(0);
    }
}
