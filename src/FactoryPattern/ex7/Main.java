package FactoryPattern.ex7;

import FactoryPattern.ex7.impl.Marine;
import FactoryPattern.ex7.impl.UnitType;

public class Main {
    public static void main(String[] args) {
        BarrackFactory barrackFactory = new BarrackFactory();
        Unit marine = barrackFactory.createUnit(UnitType.MARINE);
        Unit fireBat = barrackFactory.createUnit(UnitType.FIREBAT);
        Unit medic = barrackFactory.createUnit(UnitType.MEDIC);
        Unit ghost = barrackFactory.createUnit(UnitType.GHOST);
    }
}
