package com.bigin.game.example;

class Singleton {
    //static을 통해 class가 로드될때 객체를 생성
    private static Singleton s = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if(s == null){
            s = new Singleton();
        }
        return s;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}