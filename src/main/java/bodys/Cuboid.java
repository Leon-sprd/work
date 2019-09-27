package bodys;

public class Cuboid extends Body {
    public double a;
    private double b;
    private double c;

    public static int instances = 0;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        instances++;
    }

    @Override
    public double computeArea() {
        return 2 * (a * b + a * c + b * c);

    }

    @Override
    public double computePerimeter() {
        return 4 * c + 4 * b + 4 * a;
    }

    @Override
    public double computeVolume() {
        return a * b * c;
    }

    public Cuboid clone() {
        return new Cuboid(a, b, c);
    }

}
