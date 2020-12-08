package StrategyPattern.ex6.moving;

public class VehicleMoving implements MovingStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 탈 것을 타고 이동");
    }
}
