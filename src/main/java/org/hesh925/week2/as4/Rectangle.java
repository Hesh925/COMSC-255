package org.hesh925.week2.as4;

public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double computeArea() {
        return length * width;
    }
    public double computePerimeter() {
        return 2 * (length + width);
    }
}

