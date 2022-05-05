package FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red" , "Green", "Blue", "Yellow"};

        for (int i=0; i<10; i++) {
            int randomNumber = (int) (Math.random() * 4);
            Circle circle = (Circle) ShapeFactory.getCircle(colors[randomNumber]);

            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 4));
            circle.setRadius((int) (Math.random() * 10));
            circle.draw();
        }
    }
}
