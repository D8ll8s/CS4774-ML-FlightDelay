package ShapeClass;

public class Circle extends Shape{

    private double radius;
    private static final double PI = 3.14;


    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * PI;
    }
}
