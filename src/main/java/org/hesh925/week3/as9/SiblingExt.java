package org.hesh925.week3.as9;

import org.hesh925.week2.as5.Sibling;
public class SiblingExt extends Sibling {
    private int height;

    public SiblingExt(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }
}
