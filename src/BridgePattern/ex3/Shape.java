package BridgePattern.ex3;

public abstract class Shape {
    private Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public void drawLine(int x , int y) {
        drawing.drawLine(x , y);
    }

    public void fill() {
        drawing.fill();
    }

    public abstract void draw();
}
