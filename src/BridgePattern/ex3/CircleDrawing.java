package BridgePattern.ex3;

public class CircleDrawing implements Drawing {

    @Override
    public void drawLine(int x , int y) {
        System.out.println("Circle Draw line from " + x + "," + y);
    }

    @Override
    public void fill() {
        System.out.println("Circle Fill !");
    }
}
