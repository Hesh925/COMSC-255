package org.hesh925.week3.as12;

import org.hesh925.week3.as11.Student;

import javax.swing.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class TestStudentExt {
    public static void main(String[] args) {
        StudentExt[] students;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students", 10));
        students = new StudentExt[n];

        for (int i = 0; i < n; i++) {
            String data = JOptionPane.showInputDialog("Enter student info");
            StringTokenizer st = new StringTokenizer(data, ",");

            String name = st.nextToken().trim();
            int id = Integer.parseInt(st.nextToken().trim());

            int numGrades = Integer.parseInt(st.nextToken().trim());

            double[] grades = new double[numGrades];

            for (int j = 0; j < numGrades; j++) {
                grades[j] = Double.parseDouble(st.nextToken().trim());
            }
            String GradeType = st.nextToken().trim();


            students[i] = new StudentExt(id, name, grades, GradeType);
        }

        JOptionPane.showMessageDialog(null, FormatOut(students));
        System.exit(0);
    }

    private static String FormatOut(StudentExt[] students) {
        String outA = "", outB = "", outC = "", outD = "", outF = "", outCR = "", outNCR = "";
        for (Student s : students) {
            String grade = s.getFinalGrade();
            String out = "%d %s (%s)\n".formatted(s.getId(), s.getName(), grade);
            switch (grade) {
                case "A" -> outA += out;
                case "B" -> outB += out;
                case "C" -> outC += out;
                case "D" -> outD += out;
                case "F" -> outF += out;
                case "CR" -> outCR += out;
                case "NCR" -> outNCR += out;
            }
        }
        return outA + outB + outC + outD + outF + outCR + outNCR;
    }


    private static StudentExt[] ImportTest() {
        StudentExt[] students = new StudentExt[15];

        students[0] = new StudentExt(1, "John Adam", new double[]{93, 91, 100}, "Letter");
        students[1] = new StudentExt(2, "Raymond Woo", new double[]{65, 68, 63}, "Letter");
        students[2] = new StudentExt(3, "Rick Smith", new double[]{50, 58, 53}, "Letter");
        students[3] = new StudentExt(4, "Ray Bartlett", new double[]{62, 64, 69}, "Letter");
        students[4] = new StudentExt(5, "Mary Russell", new double[]{93, 90, 98}, "Letter");
        students[5] = new StudentExt(6, "Andy Wong", new double[]{89, 88, 84}, "Letter");
        students[6] = new StudentExt(7, "Jay Russell", new double[]{71, 73, 78}, "Letter");
        students[7] = new StudentExt(8, "Jimmie Wong", new double[]{70, 77, 72}, "Letter");
        students[8] = new StudentExt(9, "Jackie Chan", new double[]{85, 89, 84}, "Letter");
        students[9] = new StudentExt(10, "Susan Wu", new double[]{80, 88, 84}, "Letter");
        students[10] = new StudentExt(11, "Bruce Lee", new double[]{74, 79, 72, 75}, "Credit");
        students[11] = new StudentExt(12, "Chuck Norris", new double[]{63, 64, 62, 60, 68}, "Credit");
        students[12] = new StudentExt(13, "Jet Li", new double[]{85, 83, 89}, "Credit");
        students[13] = new StudentExt(14, "Jessica Lauser", new double[]{82, 84, 87}, "Letter");
        students[14] = new StudentExt(15, "Mahnoosh Nik-Ahd", new double[]{98, 99}, "Letter");

        return students;
    }
}
