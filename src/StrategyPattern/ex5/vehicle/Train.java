package StrategyPattern.ex5.vehicle;

import StrategyPattern.ex5.Vehicle;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("기차를 타고 간다.");
    }
}
