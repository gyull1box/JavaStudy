package com.bigin.game.example.chapter07_08;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 25, 30);
        System.out.println(t);
        t.setHour(t.getHour() + 1); // t.shour = 13처럼 멤버변수에 직접 접근 불가
        System.out.println(t);
    }
}