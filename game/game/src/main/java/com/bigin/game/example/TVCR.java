package com.bigin.game.example;

class VCR {
    // 대충 power, rew 등 겹치는 메서드가 존재할 때 예시
    boolean power;
    int count = 0;
    void power(){
        power = !power;
    }
    void play(){
        System.out.println("VCR PLAY");
    }
    void stop(){
        System.out.println("VCR STOP");
    }
    void rew(){
        System.out.println("VCR REW");
    }
    void ff(){
        System.out.println("VCR FF");
    }
}

class TV {
    boolean power;
    int channel;

    void power(){}
    void play(){
        System.out.println("TV PLAY");
    }
    void stop(){
        System.out.println("TV STOP");
    }
    void rew(){
        System.out.println("TV REW");
    }
    void ff(){
        System.out.println("VCR FF");
    }
}

class CaptionTV extends TV {
    String text;
    void caption() {}
}

class TVCR { // 상속
    VCR vcr = new VCR(); // 포함

    void play(){
        vcr.play();
    }

    void stop(){
        vcr.stop();
    }

    void rew(){
        vcr.rew();
    }

    void ff(){
        vcr.ff();
    }
}

class test {
//    public static void main(String[] args) {
//        TVCR test = new TVCR();
//
//        test.stop(); // VCR STOP
//        test.rew(); // VCR REW
//        test.ff(); // VCR FF
//        Object o = new Object();
//    }
    TV tt = new TV();
    TV t = new CaptionTV();
    CaptionTV c = new CaptionTV();
}