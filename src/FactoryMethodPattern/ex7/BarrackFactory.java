package FactoryMethodPattern.ex7;

import FactoryMethodPattern.ex7.impl.*;

public class BarrackFactory {
    public Unit createUnit(UnitType unitType) {
        Unit unit = null;

        switch (unitType) {
            case MARINE : return new Marine();
            case FIREBAT : return new FireBat();
            case MEDIC : return new Medic();
            case GHOST : return new Ghost();
            default : return unit;
        }
    }
}
