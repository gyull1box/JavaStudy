package com.bigin.game.example.chapter07_08;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main()에서 예외처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new  Exception();
    }
}
