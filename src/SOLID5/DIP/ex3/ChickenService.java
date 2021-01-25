package SOLID5.DIP.ex3;

public class ChickenService {
    private final Chicken chicken;

    public ChickenService(Chicken chicken) {
        this.chicken = chicken;
    }

    public void eat() {
        chicken.eat();
    }
}
