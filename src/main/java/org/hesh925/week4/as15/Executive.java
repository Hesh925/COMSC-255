package org.hesh925.week4.as15;

public class Executive extends Employee {
    protected double pctBonus;
    protected double travelExpenses;
    protected int optionsCount;

    public Executive(String name, double salary, double pctBonus, double travelExpenses, int optionsCount) {
        super(name, salary);
        this.pctBonus = pctBonus;
        this.travelExpenses = travelExpenses;
        this.optionsCount = optionsCount;
    }

    public double getPctBonus() {
        return pctBonus;
    }

    public double getTravelExpenses() {
        return travelExpenses;
    }

    public int getOptionsCount() {
        return optionsCount;
    }

    public double computeBonus() {
        return (this.getSalary() * pctBonus) + 1000.00 ;
    }
}
