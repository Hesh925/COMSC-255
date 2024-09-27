package org.hesh925.week2.as5;

public class Sibling {
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
}