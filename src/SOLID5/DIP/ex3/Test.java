package SOLID5.DIP.ex3;

public class Test {
    public static void main(String[] args) {
        ChickenService friedChickenService = new ChickenService(new FriedChicken());
        friedChickenService.eat();

        ChickenService soySourceChickenService = new ChickenService(new SoySourceChicken());
        soySourceChickenService.eat();

        ChickenService seasonedChickenService = new ChickenService(new SeasonedChicken());
        seasonedChickenService.eat();
    }
}
