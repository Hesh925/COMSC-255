package org.hesh925.week3.as12;

import org.hesh925.week3.as11.Student;

public class StudentExt extends Student {
    protected String GradeType;

    public StudentExt(int id, String name, double[] grades, String GradeType) {
        super(name, id, grades);
        this.GradeType = GradeType;
    }

    @Override
    public String getFinalGrade() {
        if (this.GradeType.equals("Credit")) {
            return CalcCredit();
        }
        else {
            return CalcLetter();
        }

    }

    protected String CalcCredit() {
        double avg = 0;
        for (double grade : this.grades) {
            avg += grade;
        }
        avg /= this.grades.length;
        if (avg >= 70) {
            return "CR";
        }
        else {
            return "NCR";
        }
    }

    protected String CalcLetter() {
        return super.getFinalGrade();
    }
}
