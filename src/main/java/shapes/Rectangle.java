```java
package shapes;

public class Rectangle extends Shape {
    public double a;
    private double b;



    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double computeArea() {
        return a * b;
    }
    @Override
    public double computePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public int edgeCount() {
        return 4;
    }
}
```
