package com.bigin.game.example;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();

    // Plyaer p = new Player(); // ERROR
}

class AudioPlayer extends Player {
    void play(int pos) { } // 추상 메서드 구현
    void stop() { }
}

abstract class AbstractPlayer extends Player{
    void play(int pos) {}
}