package SOLID5.DIP.ex2;

public class Kids {
    private final Toy toy;

    public Kids(Toy toy) {
        this.toy = toy;
    }

    public void play() {
        toy.play();
    }
}
