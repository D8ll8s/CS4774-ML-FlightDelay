package ShapeClass;

public class Rectangle extends Shape{

    private double side1;
    private double side2;



    public Rectangle(double side1, double side2, String color){
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }
    @Override
    public double getPerimeter() {
        return (this.side1 * 2) + (this.side2 * 2);
    }

    @Override
    public double getArea() {
        return this.side1 * this.side2;
    }
}
