package day9.Task2;

public class Triangle extends Figure{
    private double longitudA;
    private double longitudB;
    private double longitudC;
    public Triangle(double longitudA,double longitudB,double longitudC, String color) {
        super(color);
        this.longitudA = longitudA;
        this.longitudB = longitudB;
        this.longitudC = longitudC;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter()/2*(perimeter()/2-longitudA)*(perimeter()/2-longitudB)*(perimeter()/2-longitudC));
    }

    @Override
    public double perimeter() {
        return longitudA+longitudB+longitudC;
    }
}
