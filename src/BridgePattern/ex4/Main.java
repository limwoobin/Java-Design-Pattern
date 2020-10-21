package BridgePattern.ex4;

public class Main {
    public static void main(String[] args) {
        Warrior bowWarrior = new Warrior(new Bow());
        Warrior swordWarrior = new Warrior(new Sword());

        bowWarrior.handle();
        swordWarrior.handle();

        System.out.println("------------------------------------------------");

        Smith bowSmith = new Smith(new Bow());
        Smith swordSmith = new Smith(new Sword());

        bowSmith.handle();
        swordSmith.handle();
    }
}
