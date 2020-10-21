package BridgePattern.ex4;

public class Warrior implements WeaponHandler {
    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        System.out.print("Warrior");
        weapon.attack();
    }
}
