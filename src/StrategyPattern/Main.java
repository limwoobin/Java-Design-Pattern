package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Java Strategy Pattern ====");

        Car carUp = new Car(new Up());
        carUp.move();

        Car carDown = new Car(new Down());
        carDown.move();

        Car carLeft = new Car(new Left());
        carLeft.move();

        Car carRight = new Car(new Right());
        carRight.move();

        carRight.setMove(new Down());
        carRight.move();
    }
}
