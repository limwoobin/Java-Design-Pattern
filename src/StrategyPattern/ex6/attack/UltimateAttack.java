package StrategyPattern.ex6.attack;

public class UltimateAttack implements AttackStrategy {

    @Override
    public void attack(String name) {
        System.out.println(name + " 궁극기로 공격");
    }
}
