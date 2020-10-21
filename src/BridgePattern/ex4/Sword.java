package BridgePattern.ex4;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }

    @Override
    public void repair() {
        System.out.println("Sword repair");
    }
}
