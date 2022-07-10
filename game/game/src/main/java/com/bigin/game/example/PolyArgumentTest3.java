package com.bigin.game.example;

import java.util.Vector;

class Product4 {
    int price;
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product4(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product4() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv4 extends Product4 {
    Tv4() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer4 extends Product4 {
    Computer4() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer4 { // 고객, 물건을 사는 사람
    int money  = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체

    void buy (Product p) {
        if(money < p.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "를 구입.");
    }

    void refund (Product p) { // 구입한 제품 환불
        // 제품을 Vector에서 제거.
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 반품.");
        }
        else { // 제거 실패
            System.out.println("구입한 제품 중 해당 제품 없음.");
        }
    }

    void summary() {
        int sum = 0 ;
        String itemList = "";

        if(item.isEmpty()) {
            System.out.println("구입한 제품 없음.");
            return;
        }
        for (int i = 0 ; i < item.size() ; i++) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입한 물품 총 금액" + sum);
        System.out.println("구입한 제품" + itemList);
    }
}

class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer4 b = new Buyer4();
        Tv t = new Tv();
        Computer c = new Computer();
        Audio a = new Audio();

        b.buy(t);
        b.buy(c);
        b.buy(a);
        b.summary();
        System.out.println();
        b.refund(c);
        b.summary();

    }
}
