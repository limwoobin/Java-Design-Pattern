package StrategyPattern.ex5.vehicle;

import StrategyPattern.ex5.Vehicle;

public class Bicycle implements Vehicle {

    @Override
    public void move() {
        System.out.println("자전거를 타고 간다.");
    }
}
