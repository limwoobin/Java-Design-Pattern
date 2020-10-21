package BridgePattern.ex4;

public class Smith implements WeaponHandler {
    private Weapon weapon;

    Smith(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        System.out.print("Smith ");
        weapon.repair();
    }
}
