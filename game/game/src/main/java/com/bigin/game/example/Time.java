package com.bigin.game.example;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            this.minute = minute;
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if(second < 0 || second > 59){
            this.second = second;
        }

        this.second = second;
    }
}
