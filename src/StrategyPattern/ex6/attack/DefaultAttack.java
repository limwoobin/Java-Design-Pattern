package StrategyPattern.ex6.attack;

public class DefaultAttack implements AttackStrategy {

    @Override
    public void attack(String name) {
        System.out.println(name + " 기본 공격");
    }
}
