package SOLID5.DIP.ex1;

public class Test {
    public static void main(String[] args) {
        ShinhanCard shinhanCard = new ShinhanCard();
        shinhanCard.pay();

        Card card = new ShinhanCard();
        card.pay();

        Card card2 = new WooriCard();
        card2.pay();
    }
}
