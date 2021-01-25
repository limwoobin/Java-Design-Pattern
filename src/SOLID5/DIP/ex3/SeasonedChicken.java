package SOLID5.DIP.ex3;

public class SeasonedChicken implements Chicken {

    @Override
    public void eat() {
        System.out.println("양념치킨 섭취");
    }
}
