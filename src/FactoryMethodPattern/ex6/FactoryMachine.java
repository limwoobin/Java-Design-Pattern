package FactoryMethodPattern.ex6;

import FactoryMethodPattern.ex6.impl.Goliath;
import FactoryMethodPattern.ex6.impl.Tank;
import FactoryMethodPattern.ex6.impl.Vulture;

public class FactoryMachine {
    public Factory createUnit(Unit unit) {
        Factory factory = null;

        if (Unit.VULTURE.equals(unit)) {
            return new Vulture();
        } else if (Unit.TANK.equals(unit)) {
            return new Tank();
        } else {
            return new Goliath();
        }
    }
}
