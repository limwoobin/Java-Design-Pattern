package BridgePattern.ex3;

public class Circle extends Shape {

    public Circle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
