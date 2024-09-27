package org.hesh925.week4.as15;

public class Manager extends Employee {
    protected double pctBonus;
    protected double travelExpenses;

    public Manager(String name, double salary, double pctBonus, double travelExpenses) {
        super(name, salary);
        this.pctBonus = pctBonus;
        this.travelExpenses = travelExpenses;
    }

    public double getPctBonus() {
        return pctBonus;
    }

    public double getTravelExpenses() {
        return travelExpenses;
    }

    public double computeBonus() {
        return (this.getSalary() * pctBonus) + 500.00 ;
    }
}
