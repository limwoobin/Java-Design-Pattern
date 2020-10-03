package StrategyPattern;

public class Car {
    private CarMoveBehavior carMoveBehavior;

    public Car(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }

    public void move() {
        carMoveBehavior.action();
    }

    public void setMove(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }
}
