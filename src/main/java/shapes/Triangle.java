package shapes;

public class Triangle extends Shape {
    private double g;
    private double h;
    public double b;
    public double c;

    public Triangle(double g, double h) {
        this.g = g;
        this.h = h;
    }

    public double computeArea() {
        return 0.5 * g * h;
    }

    @Override
    public double computePerimeter() {
        return g + b + c;
    }

    @Override
    public int edgeCount() {
        return 3;
    }

}
