package org.hesh925.week4.as15;

public class Worker extends Employee {
    protected double pctBonus;

    public Worker(String name, double salary, double pctBonus) {
        super(name, salary);
        this.pctBonus = pctBonus;
    }

    public double getPctBonus() {
        return pctBonus;
    }

    public double computeBonus() {
        return this.getSalary() * pctBonus;
    }

}
