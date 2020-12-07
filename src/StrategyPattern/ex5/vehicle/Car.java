package StrategyPattern.ex5.vehicle;

import StrategyPattern.ex5.Vehicle;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("자차를 타고 간다.");
    }
}
