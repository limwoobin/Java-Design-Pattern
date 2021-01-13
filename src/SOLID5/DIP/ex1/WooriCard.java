package SOLID5.DIP.ex1;

public class WooriCard implements Card {

    @Override
    public void pay() {
        System.out.println("우리 카드");
    }
}
