package BridgePattern.ex4;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Bow Attack");
    }

    @Override
    public void repair() {
        System.out.println("Bow repair");
    }
}
