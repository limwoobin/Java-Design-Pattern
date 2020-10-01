package FactoryPattern.ex5;

public class NYStyleCheesePizza implements Pizza {
    public NYStyleCheesePizza() {
        System.out.println("NY Cheese Pizza create!");
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }
}
