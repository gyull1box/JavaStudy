package com.bigin.game.example;

public class InnerClassEx6 {
    Object iv = new Object() { void method() {} };
    static Object cv = new Object() { void method() {} };

    void myMethod() {
        Object lv = new Object() { void method() {} };
    }
}