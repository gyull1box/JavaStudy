package com.bigin.game.example;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main()에서 예외");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외");
            throw e;
        }
    }
}
