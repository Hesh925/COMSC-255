package org.hesh925.week2.as6;
import java.util.Arrays;


public class Statistics {
    private double[] data;
    private double[] sortedData;


    public Statistics(double[] data) {
        this.data = data.clone();
        this.sortedData = data.clone();
        Arrays.sort(this.sortedData);
    }


    public double[] getOrigData() {
        return this.data.clone();
    }


    public double[] getSortedData() {
        return this.sortedData.clone();
    }


    public double findMin() {
        return this.sortedData[0];
    }


    public double findMax() {
        return this.sortedData[this.sortedData.length - 1];
    }


    public double findMean() {
        double sum = 0;
        for (double i : this.data) {
            sum += i;
        }
        return sum / this.data.length;
    }


    public double findMedian() {
        int l = this.sortedData.length;
        if (this.sortedData.length % 2 == 0) {
            return (this.sortedData[l / 2] + this.sortedData[l / 2 - 1]) / 2.0;
        } else {
            return this.sortedData[l / 2];
        }
    }




}

