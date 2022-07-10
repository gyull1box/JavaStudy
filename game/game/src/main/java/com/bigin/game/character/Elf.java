package com.bigin.game.character;

import com.bigin.game.common.CommonAttributesAndSkiils;
import com.bigin.game.common.Status;

public class Elf extends CommonAttributesAndSkiils {
    int rapid = 500; // 1분 동안 공격 속도가 500% 상승
    short sBow = 5 ; // Short Bow
    long lBow = 10; // Long Bow
    int elusion = 30; // 회피력 30% 상승
    static int heigth = 269;

    void addSbow(){
        setAttackPower(getAttackPower() + (getAttackPower() * (sBow/100)));
    }

    void  addLbow(){
        setAttackPower(getAttackPower() + (getAttackPower() * ( Long.valueOf(lBow).intValue()/100)));
    }

    int addRapid(){
        elusion = getDefensivePower() * (elusion/100);
        return elusion;
    }

    void whenUltimate(){
        if(getLevel() != 99){
            return;
        }
        this.setAttackPower(this.getAttackSpeed() * (rapid/100)) ;
    }

    public int getRapid() {
        return rapid;
    }

    public void setRapid(int rapid) {
        this.rapid = rapid;
    }

    public short getsBow() {
        return sBow;
    }

    public void setsBow(short sBow) {
        this.sBow = sBow;
    }

    public long getlBow() {
        return lBow;
    }

    public void setlBow(long lBow) {
        this.lBow = lBow;
    }

    public int getElusion() {
        return elusion;
    }

    public void setElusion(int elusion) {
        this.elusion = elusion;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "rapid=" + rapid +
                ", sBow=" + sBow +
                ", lBow=" + lBow +
                ", elusion=" + elusion +
                '}';
    }
}
