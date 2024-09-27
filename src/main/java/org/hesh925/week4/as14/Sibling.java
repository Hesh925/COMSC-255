package org.hesh925.week4.as14;

public class Sibling implements Status {
    protected int age, weight;
    protected String name;


    public Sibling(String name, int age, int weight) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }



    public void displayStatus() {
        System.out.println(this.getStatus());
    }

    public String getStatus() {
        String out;
        out = "Sibling\n";
        out += "Name=" + this.getName() + ", ";
        out += "Age=" + this.getAge() + ", ";
        out += "Weight=" + this.getWeight() + "\n";

        return out;
    }
}
