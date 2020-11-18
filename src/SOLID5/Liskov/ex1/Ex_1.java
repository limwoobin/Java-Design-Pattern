package SOLID5.Liskov.ex1;

// 잘못된 예제
public class Ex_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle square = new Square();

        System.out.println(getArea(rectangle) == 200);
        System.out.println(getArea(square) == 100);
    }

    private static int getArea(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        return rectangle.getArea();
    }
}

class Rectangle {
    protected int width;
    protected int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {

    @Override
    public int getArea() {
        return width * width;
    }
}