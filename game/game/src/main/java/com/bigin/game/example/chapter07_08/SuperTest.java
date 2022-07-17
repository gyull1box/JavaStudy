package com.bigin.game.example.chapter07_08;

class SuperTest {
    public static void main(String[] args) {
        Cd c = new Cd();
        c.method();
    }
}
class Pt {
    int x = 10;
}

class Cd extends Pt {
    int x = 20;
    void method(){
        System.out.println("x = " + x); // x = 10   // x = 20
        System.out.println("this.x = " + this.x); // x = 10 // this.x = 20
        System.out.println("super.x = " + super.x); // x = 10 // super.x = 10
    }
}