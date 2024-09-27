package org.hesh925.week3.as13;
import org.hesh925.week3.as11.Student;
import org.hesh925.week3.as12.StudentExt;

import java.io.*;
import java.util.StringTokenizer;
public class TestStudentExtFileIO {
    public static void main(String[] args) {
        StudentExt[] students;
        String InFP = "src/main/resources/as13/in.txt";
        String OutFP = "src/main/resources/as13/out.txt";
        try {
            FileReader fr = new FileReader(InFP);
            BufferedReader br = new BufferedReader(fr);
            int n = Integer.parseInt(br.readLine());
            students = new StudentExt[n];

            for (int i = 0; i < n; i++) {
                String data = br.readLine();
                StringTokenizer st = new StringTokenizer(data, ",");

                int id = Integer.parseInt(st.nextToken().trim());
                String name = st.nextToken().trim();

                int numGrades = Integer.parseInt(st.nextToken().trim());

                double[] grades = new double[numGrades];

                for (int j = 0; j < numGrades; j++) {
                    grades[j] = Double.parseDouble(st.nextToken().trim());
                }
                String GradeType = st.nextToken().trim();

                students[i] = new StudentExt(id, name, grades, GradeType);
            }
            PrintWriter pw = new PrintWriter(new FileWriter(OutFP));
            pw.print(FormatOut(students));

            pw.close();
            br.close();
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

    protected static int GetFileLength(String inPath) throws RuntimeException {
        try {
            FileReader fr = new FileReader(inPath);
            BufferedReader br = new BufferedReader(fr);
            int n;
            for(n = 0; br.readLine() != null; n++);

            br.close();
            fr.close();
            return n;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


