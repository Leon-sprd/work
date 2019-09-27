package bodys;

import shapes.Shape;

public class ShapeBody extends Body {

    private Shape shape;
    private double height;

    public ShapeBody(Shape shape, double height) {
        this.shape = shape;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 2 * shape.computeArea() + height * shape.computePerimeter();
    }

    @Override
    public double computePerimeter() {
        return 2 * shape.computePerimeter() + shape.edgeCount() * height;
    }

    @Override
    public double computeVolume() {
        return shape.computeArea() * height;
    }
}
