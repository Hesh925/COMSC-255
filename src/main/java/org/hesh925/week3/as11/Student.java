package org.hesh925.week3.as11;

import java.util.StringTokenizer;

public class Student {
    protected String name;
    protected int id;
    protected double[] grades;

    public Student(String name, int id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades.clone();
    }

    public Student(String data) {
        StringTokenizer st = new StringTokenizer(data, ",");

        this.name = st.nextToken().trim();
        this.id = Integer.parseInt(st.nextToken().trim());

        int numGrades = Integer.parseInt(st.nextToken().trim());

        grades = new double[numGrades];

        for (int j = 0; st.hasMoreTokens(); j++) {
            grades[j] = Double.parseDouble(st.nextToken().trim());
        }
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getFinalGrade() {
        System.out.println(this.name);
        double avg = 0;

        for (double grade : this.grades) {
            avg += grade;
        }

        avg /= this.grades.length;
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
