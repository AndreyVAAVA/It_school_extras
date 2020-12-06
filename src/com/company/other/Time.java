package com.company.other;

public class Time {
    int hour, min, sec;
    public Time (int sec){
        hour = sec / 3600;
        sec = sec - (hour * 3600);
        min = sec / 60;
        sec = sec - (min * 60);
        this.sec = sec;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
