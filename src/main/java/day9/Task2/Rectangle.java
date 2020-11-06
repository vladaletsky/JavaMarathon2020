package day9.Task2;

public class Rectangle extends Figure {

    private double width, height;

    public Rectangle(double width, double heigth, String color) {
        super(color);
        this.width = width;
        this.height = heigth;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width * 2) + (height * 2);
    }
}
