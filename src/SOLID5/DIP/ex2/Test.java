package SOLID5.DIP.ex2;

public class Test {
    public static void main(String[] args) {
        Kids kids = new Kids(new Robot());
        kids.play();

        kids = new Kids(new Lego());
        kids.play();

        kids = new Kids(new Doll());
        kids.play();
    }
}
