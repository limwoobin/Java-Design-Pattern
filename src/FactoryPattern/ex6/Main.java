package FactoryPattern.ex6;

public class Main {
    public static void main(String[] args) {
        FactoryMachine factoryMachine = new FactoryMachine();

        Factory vulture = factoryMachine.createUnit(Unit.VULTURE);
        Factory tank = factoryMachine.createUnit(Unit.TANK);
        Factory goliath = factoryMachine.createUnit(Unit.GOLIATH);

        vulture.hi();
        tank.hi();
        goliath.hi();
    }
}
