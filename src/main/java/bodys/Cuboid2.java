package bodys;

import shapes.Rectangle;

public class Cuboid2 extends ShapeBody {

    public Cuboid2(double a, double b, double c) {
        super(new Rectangle(a, b), c);
    }

}
