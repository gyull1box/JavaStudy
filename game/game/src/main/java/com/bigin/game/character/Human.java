package com.bigin.game.character;

import com.bigin.game.common.CommonAttributesAndSkiils;
import com.bigin.game.common.Status;

public class Human extends CommonAttributesAndSkiils {
    public int setLevel;
    int invincible = 10; // 10초간 무적이 됨
    short sswork = 5; // Short Swork
    long lswork = 10; // Long Swork
    int guard = 30; // 방어력 30% 상승

    Human(int invincible, short sswork, long lswork, int guard){
        this.invincible = invincible;
        this.sswork = sswork;
        this.lswork = lswork;
        this.guard = guard;
    }

    Human(Human human2){
        this.invincible = human2.invincible;
        this.sswork = human2.sswork;
        this.lswork = human2.lswork;
        this.guard = human2.guard;
    }

    Human(){

    }

    void whenUltimate(Monster monster){
        if(getLevel() != 99){
            return;
        }
        monster.setStatus(Status.CODE4444.getCode());
    }

    void addSswork(){
        setAttackPower(getAttackPower() + (getAttackPower() * (sswork/100)));
    }

    void  addLswork(){
        setAttackPower(getAttackPower() + (getAttackPower() * ( Long.valueOf(lswork).intValue()/100)));
    }

    void addDefensivePower(){
        setDefensivePower(getDefensivePower() * (guard/100));
    }

    void addDefensivePower(int guard){
        setDefensivePower(getDefensivePower() * (guard/100));
        setHp(guard * 20);
    }


    public int getInvincible() {
        return invincible;
    }

    public void setInvincible(int invincible) {
        this.invincible = invincible;
    }

    public short getSswork() {
        return sswork;
    }

    public void setSswork(short sswork) {
        sswork = sswork;
    }

    public long getLsowork() {
        return lswork;
    }

    public void setLsowork(long lsowork) {
        lsowork = lsowork;
    }

    @Override
    public String toString() {
        return "Human{" +
                "invincible=" + invincible +
                ", Sswork=" + sswork +
                ", Lsowork=" + lswork +
                '}';
    }
}
