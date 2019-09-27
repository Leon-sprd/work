package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int edgeCount() {
        return 0;
    }
}
