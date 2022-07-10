package com.bigin.game.example;

public class ExceptionEx08 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println(6);
    } // java.lang.ArithmeticException: / by zero
}
