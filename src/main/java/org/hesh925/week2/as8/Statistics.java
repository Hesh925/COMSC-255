package org.hesh925.week2.as8;
import java.util.Arrays;


public class Statistics {
    private double[] data;
    private double[] sortedData;


    public Statistics(double[] data) {
        this.data = data.clone();
        this.sortedData = computeSortedData(data);
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
        return computeMean(this.data);
    }


    public double findMedian() {
        return computeMedian(this.sortedData);
    }

    public static double computeMin(double[] data) {
        double sorted[] = computeSortedData(data.clone());
        return sorted[0];
    }

    public static double computeMax(double[] data) {
        double sorted[] = computeSortedData(data.clone());
        return sorted[sorted.length - 1];
    }


    public static double computeMean(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }

    public static double computeMedian(double[] data) {
        double[] sortedData = data.clone();
        Arrays.sort(sortedData);
        int l = sortedData.length;
        if (sortedData.length % 2 == 0) {
            return (sortedData[l / 2] + sortedData[l / 2 - 1]) / 2.0;
        } else {
            return sortedData[l / 2];
        }
    }

    public static double[] computeSortedData(double[] data) {
        double[] sortedData = data.clone();
        Arrays.sort(sortedData);
        return sortedData;
    }
}

