package com.bigin.game.example.chapter07_08;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child5 child5 = new Child5();
        child5.method1();
        child5.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child5 extends Parent5 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");
    }
}

class Parent5 {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
