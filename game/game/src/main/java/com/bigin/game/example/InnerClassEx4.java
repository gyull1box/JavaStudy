package com.bigin.game.example;

public class InnerClassEx4 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InstanceInner instanceInner = outer.new InstanceInner();
        System.out.println("instanceInner.iv : " + instanceInner.iv); // 100
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv); // 300

        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("staticInner.iv : " + staticInner.iv); // 200
    }

}

class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}
