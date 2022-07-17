package com.bigin.game.example.chapter07_08;

public class Car {
//    Engine e = new Engine();
//    Door[] d = new Door[4];
    String color;
    int door;
    void drive(){
        System.out.println("d");
    }

    void stop(){
        System.out.println("s");
    }
}

class FireEngine extends Car {
    void water(){
        System.out.println("w");
    }
}

class Ambulance extends Car {
    void siren(){
        System.out.println("ss");
    }
}

class test2 {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        Car car = null;
        Car car1 = new Car();

        car = fe; // 업캐스팅 (형변환 생략 가능)
        fe2 = (FireEngine)car ; // 다운캐스팅 (형변환 생략 불가)

        if(car instanceof FireEngine){
            System.out.println("car -> f 가능"); // 가능
        } else if (car instanceof Ambulance){
            System.out.println("car -> e 가능");
        }
    }
}