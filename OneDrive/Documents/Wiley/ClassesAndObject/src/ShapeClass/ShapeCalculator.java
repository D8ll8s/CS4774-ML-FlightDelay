package ShapeClass;

public class ShapeCalculator {
    public static void main(String[] args){
        Square my = new Square(5,"red");
        System.out.println(my.getArea());

        Rectangle my1 = new Rectangle(2,5,"red");
        System.out.println(my1.getArea());

        Circle my2 = new Circle(5,"red");
        System.out.println(my2.getArea());

        Triangle my3 = new Triangle(3,8,9,"red");
        System.out.println(my3.getArea());


    }
}
