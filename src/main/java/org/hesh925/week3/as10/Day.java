package org.hesh925.week3.as10;

public class Day {
    private int day;
    private int month;

    public Day(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int findDayNumber() {
        int dayNumber = 0;
        for (int i = 1; i < this.month; i++) {
            if (i == 2) {
                dayNumber += 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayNumber += 30;
            } else {
                dayNumber += 31;
            }
        }
        dayNumber += this.day;
        return dayNumber;
    }

    private int findDayNumber(int day, int month) {
        int dayNumber = 0;
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                dayNumber += 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayNumber += 30;
            } else {
                dayNumber += 31;
            }
        }
        dayNumber += day;
        return dayNumber;
    }


}
