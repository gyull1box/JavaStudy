package com.bigin.game.example.chapter07_08;

public class StaticTest {
    static int w = 200; // 클래스 변수 (static 변수)
    static int h = 200;

    static {
        // static 변수의 복잡한 초기화 수행
    }

    static int max(int a, int b){
        return a > b ? a: b;
    }
}
