package StrategyPattern.ex6;

import StrategyPattern.ex6.attack.AttackStrategy;
import StrategyPattern.ex6.attack.DefaultAttack;
import StrategyPattern.ex6.moving.MovingStrategy;
import StrategyPattern.ex6.moving.WalkingMoving;

public abstract class Soldier {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    Soldier(String name) {
        this.movingStrategy = new WalkingMoving();
        this.attackStrategy = new DefaultAttack();
        this.name = name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    void attack() {
        this.attackStrategy.attack(name);
    }

    void moving() {
        this.movingStrategy.move(name);
    }
}
