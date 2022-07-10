package com.bigin.game.common;

public class CommonAttributesAndSkiils {
    /**
     * 공통 속성
     */
    int level = 0; // 레벨
    int hp = 1 ; // HP (생명력)
    int mp = 1; // MP (마나)
    int attackPower  = 0 ; // 공격력
    int attackSpeed = 0; // 공격 속도
    int defensivePower = 0 ; // 방어력
    int manaPoint = 0; // 회피율 (%)
    String status = Status.CODE0000.toString(); // 현재 상태

    /**
     * 공통 스킬
     */
    int heal = 0 ; // HP 가 오른다
    int steam = 20 ; // 공격력 20% 상승

     void levelUp(){ // 레벨 업
        level = level + 1 ;
    }

    int attack(int Skill){ // 공격 시 Skill 에 따라 mp 감소
         int cnt = 0 ;
         if(mp <= 0){
            status = Status.CODE0001.getCode();
            cnt++;
            return 0 ;
         }
         return mp - Skill ;
    }

    void addHealAndStream(int healPoint){ // Heal 증가 및 steam 증가
         heal = heal + healPoint ;
        attackPower += attackPower * (steam/100)  ;
    }

    void dead(){ // hp 가 0이거나 0보다 작으면 죽는다.
         if(hp <= 0 ){
             status = Status.CODE4444.getCode();
         }
    }

    void ultimate(){ // 궁극의 스킬 사용 가능
         status = Status.CODE9999.getCode();
    }
    /**
     * Getter Setter
     */
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getDefensivePower() {
        return defensivePower;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getSteam() {
        return steam;
    }

    public void setSteam(int steam) {
        this.steam = steam;
    }

    @Override
    public String toString() {
        return "CommonAttributesAndSkiils{" +
                "level=" + level +
                ", hp=" + hp +
                ", mp=" + mp +
                ", attackPower=" + attackPower +
                ", attackSpeed=" + attackSpeed +
                ", defensivePower=" + defensivePower +
                ", manaPoint=" + manaPoint +
                ", status='" + status + '\'' +
                ", heal=" + heal +
                ", steam=" + steam +
                '}';
    }
}
