package StrategyPattern.ex5;

public class Man {
    private Vehicle vehicle;

    public Man() {

    }

    public Man(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void move() {
        if (vehicle == null) {
            System.out.println("도보로 간다.");
        } else {
            vehicle.move();
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
