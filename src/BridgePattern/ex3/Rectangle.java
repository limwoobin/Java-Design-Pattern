package BridgePattern.ex3;

public class Rectangle extends Shape {

    public Rectangle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}
