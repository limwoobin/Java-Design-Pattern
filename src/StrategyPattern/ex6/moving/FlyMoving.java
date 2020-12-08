package StrategyPattern.ex6.moving;

public class FlyMoving implements MovingStrategy {
    
    @Override
    public void move(String name) {
        System.out.println(name + " 날아서 이동");
    }
}
