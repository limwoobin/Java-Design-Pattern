package StrategyPattern.ex4;

public class Wand implements Weapon {
    @Override
    public void attack() {
        System.out.println("지팡이로 공격");
    }
}
