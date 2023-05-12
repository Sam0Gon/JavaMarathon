package day9.Task2;

public class Rectangle extends Figure{
    private double longitud;
    private double anchura;
    public Rectangle(double anchura, double longitud, String color) {
        super(color);
        this.anchura = anchura;
        this.longitud = longitud;
    }

    @Override
    public double area() {
        return longitud*anchura;
    }

    @Override
    public double perimeter() {
        return 2*(longitud+anchura);
    }
}
