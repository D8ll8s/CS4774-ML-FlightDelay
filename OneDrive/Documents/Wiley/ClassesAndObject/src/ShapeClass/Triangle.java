package ShapeClass;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b  + this.c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        double root = s * (s - a) * (s - b) * (s - c);
        double finalArea = Math.sqrt(root);
        return finalArea;
    }
}
