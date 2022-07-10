package com.bigin.game.example;

public class BindingTest {

    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = "+p.x); // p.x = 100
        System.out.println("c.x = "+c.x); // c.x = 200

        p.method(); // Child Method
        c.method(); // Child Method
    }

}

class Parent2{
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2{
    int x = 200;
    void method() {
        System.out.println("x = " + x);
        System.out.println("sup.x = " + super.x);
        System.out.println("thi.x = " + this.x);
    }
}
