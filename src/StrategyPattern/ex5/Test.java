package StrategyPattern.ex5;

import StrategyPattern.ex5.vehicle.Bicycle;
import StrategyPattern.ex5.vehicle.Car;
import StrategyPattern.ex5.vehicle.Taxi;
import StrategyPattern.ex5.vehicle.Train;

public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        man.move();

        man.setVehicle(new Train());
        man.move();

        man.setVehicle(new Taxi());
        man.move();

        man.setVehicle(new Car());
        man.move();

        man.setVehicle(new Bicycle());
        man.move();

        System.out.println("------------------------------------");

        Man man2 = new Man(new Bicycle());
        man2.move();

        man2 = new Man(new Train());
        man2.move();

        man2 = new Man(new Car());
        man2.move();

        man2 = new Man(new Taxi());
        man2.move();

        man2 = new Man();
        man2.move();
    }
}
