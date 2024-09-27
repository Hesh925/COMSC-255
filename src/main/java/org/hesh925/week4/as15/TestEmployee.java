package org.hesh925.week4.as15;

import javax.swing.*;
import java.util.Objects;
import java.util.StringTokenizer;

enum EmpType {
    EXECUTIVE, MANAGER, WORKER
}

public class TestEmployee {
    public static void main(String[] args) {
        int numW = Integer.parseInt(JOptionPane.showInputDialog("Enter number of workers"));
        int numM = Integer.parseInt(JOptionPane.showInputDialog("Enter number of managers"));
        int numE = Integer.parseInt(JOptionPane.showInputDialog("Enter number of executives"));

        Boolean isData = JOptionPane.showConfirmDialog(null, "Import in single string?", "Data", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        int numEmp = numW + numM + numE;
        Employee[] emp = new Employee[numEmp];
        int empIndex = 0;

        for (int i = 0; i < numW; i++) {
            if(isData) {
                emp[empIndex] = GetUserIn(EmpType.WORKER, JOptionPane.showInputDialog("Enter worker data"));
                empIndex++;
                continue;
            }
            emp[empIndex] = GetUserIn(EmpType.WORKER);
            empIndex++;
        }

        for (int i = 0; i < numM; i++) {
            if(isData) {
                emp[empIndex] = GetUserIn(EmpType.MANAGER, JOptionPane.showInputDialog("Enter manager data"));
                empIndex++;
                continue;
            }
            emp[empIndex] = GetUserIn(EmpType.MANAGER);
            empIndex++;
        }

        for (int i = 0; i < numE; i++) {
            if(isData) {
                emp[empIndex] = GetUserIn(EmpType.EXECUTIVE, JOptionPane.showInputDialog("Enter executive data"));
                empIndex++;
                continue;
            }
            emp[empIndex] = GetUserIn(EmpType.EXECUTIVE);
            empIndex++;
        }

        String outAll, outW = "", outM = "", outE = "";

        for (int i = 0; i < emp.length; i++) {
            if (emp[i] instanceof Worker) {
                outW += DisplayEmployee(emp[i]);

            } else if (emp[i] instanceof Manager) {
                outM += DisplayEmployee(emp[i]);

            } else if (emp[i] instanceof Executive) {
                outE += DisplayEmployee(emp[i]);
            }
        }

        JOptionPane.showMessageDialog(null, (outW + outM + outE));
    }

    private static Employee GetUserIn(EmpType Type) {
        String name;
        double salary, pctBonus, travelExpense;
        int optionCount;

        name = JOptionPane.showInputDialog("Enter name");
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary"));
        pctBonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus percentage"));

        switch (Type) {
            case EXECUTIVE:
                travelExpense = Double.parseDouble(JOptionPane.showInputDialog("Enter travel expense"));
                optionCount = Integer.parseInt(JOptionPane.showInputDialog("Enter option count"));
                return new Executive(name, salary, pctBonus, travelExpense, optionCount);
            case MANAGER:
                travelExpense = Double.parseDouble(JOptionPane.showInputDialog("Enter travel expense"));
                return new Manager(name, salary, pctBonus, travelExpense);
            case WORKER:
                return new Worker(name, salary, pctBonus);
            default:
                return null;
        }
    }

    private static Employee GetUserIn(EmpType Type, String Data) {
        // If Data is empty, have user input data manually
        if(Objects.equals(Data, "")) return GetUserIn(Type);

        StringTokenizer st = new StringTokenizer(Data, ",");
        String name = st.nextToken();
        double salary = Double.parseDouble(st.nextToken().trim());
        double pctBonus = Double.parseDouble(st.nextToken().trim());

        switch (Type) {
            case EXECUTIVE:
                double TE_E = Double.parseDouble(st.nextToken().trim());
                int optionCount = Integer.parseInt(st.nextToken().trim());
                return new Executive(name, salary, pctBonus, TE_E, optionCount);
            case MANAGER:
                double TE_M = Double.parseDouble(st.nextToken().trim());
                return new Manager(name, salary, pctBonus, TE_M);
            case WORKER:
                return new Worker(name, salary, pctBonus);
            default:
                return null;
        }
    }

    private static String DisplayEmployee(Employee E) {
        String out = "\n";
        out += "Name: " + E.getName() + "\n";
        out += "Yearly Salary: " + E.getSalary() + "\n";

        if (E instanceof Worker) {
            out += "Percent Bonus: " + ((Worker) E).getPctBonus() + "\n";
            out += "Total Bonus: " + E.computeBonus() + "\n";
        } else if (E instanceof Manager) {
            out += "Percent Bonus: " + ((Manager) E).getPctBonus() + "\n";
            out += "Total Bonus: " + E.computeBonus() + "\n";
            out += "Travel Expenses: " + ((Manager) E).getTravelExpenses() + "\n";
        } else if (E instanceof Executive) {
            out += "Percent Bonus: " + ((Executive) E).getPctBonus() + "\n";
            out += "Total Bonus: " + E.computeBonus() + "\n";
            out += "Travel Expenses: " + ((Executive) E).getTravelExpenses() + "\n";
            out += "Options Count: " + ((Executive) E).getOptionsCount() + "\n";
        }
        return out;
    }
}