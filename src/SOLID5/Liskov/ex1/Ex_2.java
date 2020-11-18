package SOLID5.Liskov.ex1;

// 수정된 코드
public class Ex_2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle2(10 , 20);
        Shape square = new Square2(10);

        System.out.println(getArea(rectangle));
        System.out.println(getArea(square));
    }

    private static int getArea(Shape shape) {
        return shape.getArea();
    }
}

abstract class Shape {
    abstract int getArea();
}

class Rectangle2 extends Shape {
    protected int width;
    protected int height;

    public Rectangle2(int width , int hegith) {
        this.width = width;
        this.height = hegith;
    }

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

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square2 extends Shape {
    protected int width;

    public Square2(int width) {
        this.width = width;
    }

    @Override
    int getArea() {
        return width * width;
    }
}