package ShapeClass;

public class Square extends Shape{

    private double side;


    public Square(double side, String color){
        this.side = side;
        this.color = color;
    }
    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
