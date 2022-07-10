package com.bigin.game.example;

class Card{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card(){
        this("HEART",1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {

    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println(c.KIND); // HEART
        System.out.println(c.NUMBER); // 10
        System.out.println(c); // HEART 10

    }
}
