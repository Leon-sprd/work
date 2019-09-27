package shapes;

import com.sun.tools.internal.ws.wsdl.framework.QNameAction;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
       /* Shape shape = new Quadrat(12.5);
        double area = shape.computeArea();
        System.out.println("Area of shape: " + area);

        Rectangle rectangle = new Rectangle(8,9);
        double rectangleArea = rectangle.computeArea();

        System.out.println("Area of rectangle: " + rectangleArea);


        Quadrat q1 = new Quadrat(1);
        Quadrat foo = new Quadrat(2);
        Quadrat bar = new Quadrat(2);


        Circle circle = new Circle(3.0);
        circle.computeArea();

        shape = circle;
*/

        Shape[] shapes = {new Quadrat(3), new Rectangle(1, 2), new Circle(3)};

        for (int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];

            s.computeArea();

        }


    }
}
