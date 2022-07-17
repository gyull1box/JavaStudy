package com.bigin.game.example.chapter07_08;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    //toString 오버라이딩
    @Override
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {super(200);}

    @Override
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];

    void buy(Product product) {
        if(money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product +"상품을 구매하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());

        System.out.println("남은 잔액 "+buyer.money+"만원");
        System.out.println("현재 포인트는 "+buyer.bonusPoint+"점");
    }
}