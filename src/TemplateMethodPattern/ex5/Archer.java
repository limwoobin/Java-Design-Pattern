package TemplateMethodPattern.ex5;

public class Archer extends Warrior {

    @Override
    void prepareWeapon() {
        System.out.println("활을 챙긴다.");
    }

    @Override
    void attack() {
        System.out.println("활을 쏜다.");
    }

    @Override
    boolean isUsingPrepareOther() {
        return true;
    }

    @Override
    void prepareOther() {
        System.out.println("화살을 다시 준비한다.");
    }
}
