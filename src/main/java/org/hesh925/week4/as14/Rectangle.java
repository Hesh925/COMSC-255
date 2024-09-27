package org.hesh925.week4.as14;

public class Rectangle implements Status {
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


    public void displayStatus() {
        System.out.println(this.getStatus());
    }
    public String getStatus() {
        String out;
        out = "Rectangle\n";
        out += "Length=" + this.getLength() + ", ";
        out += "Width=" + this.getWidth() + "\n";

        return out;
    }
}

