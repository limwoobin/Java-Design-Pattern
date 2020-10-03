package StrategyPattern.ex4;

public class Ax implements Weapon {
    @Override
    public void attack() {
        System.out.println("도끼로 공격");
    }
}
