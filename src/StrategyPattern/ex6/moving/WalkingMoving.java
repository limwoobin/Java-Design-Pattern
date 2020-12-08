package StrategyPattern.ex6.moving;

public class WalkingMoving implements MovingStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 걸어서 이동");
    }
}
