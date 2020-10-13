package BridgePattern.ex3;

public class RectDrawing implements Drawing {

    @Override
    public void drawLine(int x , int y) {
        System.out.println("Rect Draw line from " + x + "," + y);
    }

    @Override
    public void fill() {
        System.out.println("Rect Fill !");
    }
}
