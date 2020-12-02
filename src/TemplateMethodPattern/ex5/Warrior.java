package TemplateMethodPattern.ex5;

public abstract class Warrior {

    protected final void prepareWar() {
        training();
        prepareWeapon();
        attack();
        if (isUsingPrepareOther()) {
            prepareOther();
        }
    }

    void training() {
        System.out.println("훈련을 한다.");
    };

    // hook Method
    void prepareOther() {}
    boolean isUsingPrepareOther() {
        return false;
    }

    abstract void prepareWeapon();
    abstract void attack();
}
