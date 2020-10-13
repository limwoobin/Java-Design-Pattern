package BridgePattern.ex3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RectDrawing());
        Shape circle = new Circle(new CircleDrawing());

        rectangle.drawLine(10 , 3);
        rectangle.fill();
        rectangle.draw();

        System.out.println();

        circle.drawLine(3 , 5);
        circle.fill();
        circle.draw();
    }
}
