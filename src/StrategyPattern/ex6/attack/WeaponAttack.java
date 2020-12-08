package StrategyPattern.ex6.attack;

public class WeaponAttack implements AttackStrategy {

    @Override
    public void attack(String name) {
        System.out.println(name + " 무기로 공격");
    }
}
