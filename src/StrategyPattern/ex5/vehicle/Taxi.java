package StrategyPattern.ex5.vehicle;

import StrategyPattern.ex5.Vehicle;

public class Taxi implements Vehicle {

    @Override
    public void move() {
        System.out.println("택시를 타고 간다.");
    }
}
