package com.bigin.game.example.chapter07_08;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
    }
}

interface Repairable {
}

class GroundUnit extends TerranUnit {
    public GroundUnit(int hp) {
        super(hp);
    }

}

class AirUnit extends TerranUnit {
    public AirUnit(int hp) {
        super(hp);
    }

}

class TerranUnit {
    int hitPoint;
    final int MAX_HP;

    TerranUnit(int hp) {
        MAX_HP = hp;
    }

}

class Tank extends GroundUnit implements Repairable {
    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }

}

class DropShip extends AirUnit implements Repairable {
    public DropShip() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnit {
    public Marine() {
        super(40);
        hitPoint = MAX_HP;
    }

}

class SCV extends GroundUnit implements Repairable {
    public SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable repairable) {
        if (repairable instanceof TerranUnit) {
           TerranUnit unit = (TerranUnit) repairable;
            while (unit.hitPoint != unit.MAX_HP) {
                unit.hitPoint++;
            }
            System.out.println(unit.toString() + "의 수리가 끝.");
        }
    }
}
