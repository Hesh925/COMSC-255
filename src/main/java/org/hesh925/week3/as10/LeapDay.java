package org.hesh925.week3.as10;

public class LeapDay extends Day{

    private final int year;

    public LeapDay(int day, int month, int year) {
        super(day, month);
        this.year = year;
    }
    public int getYear() {
        return this.year;
    }

    @Override
    public int findDayNumber() {
        int day = super.findDayNumber();
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
            return day + 1;
        } else {
            return day;
        }
    }
}
