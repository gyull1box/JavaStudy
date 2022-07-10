package com.bigin.game.example;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1() 끝내고 돌아옴");
    }

    static void method1() {
        try {
            System.out.println("method1() 호출");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1() finally");
        }
    }
}
