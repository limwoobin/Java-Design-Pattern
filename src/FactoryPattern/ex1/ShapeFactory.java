package FactoryPattern.ex1;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeType.SQUARE.equals(shapeType)) {
            return new Rectangle();
        }

        return null;
    }
}
