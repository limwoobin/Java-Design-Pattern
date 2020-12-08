package StrategyPattern.ex6;

import StrategyPattern.ex6.attack.UltimateAttack;
import StrategyPattern.ex6.attack.WeaponAttack;
import StrategyPattern.ex6.moving.FlyMoving;
import StrategyPattern.ex6.moving.VehicleMoving;

public class Test {
    public static void main(String[] args) {
        Soldier warrior = new Warrior("Warrior");
        Soldier wizard = new Wizard("Wizard");

        warrior.attack();
        warrior.moving();
        wizard.attack();
        wizard.moving();

        System.out.println("--------------------------------");

        warrior.setMovingStrategy(new VehicleMoving());
        warrior.setAttackStrategy(new WeaponAttack());

        wizard.setMovingStrategy(new VehicleMoving());
        wizard.setAttackStrategy(new WeaponAttack());

        warrior.attack();
        warrior.moving();
        wizard.attack();
        wizard.moving();

        System.out.println("--------------------------------");

        warrior.setMovingStrategy(new FlyMoving());
        warrior.setAttackStrategy(new UltimateAttack());

        wizard.setMovingStrategy(new FlyMoving());
        wizard.setAttackStrategy(new UltimateAttack());

        warrior.attack();
        warrior.moving();
        wizard.attack();
        wizard.moving();
    }
}
