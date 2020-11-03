package day9.Task2;

public class Triangle extends Figure {

    private int oneSide;
    private int twoSide;
    private int threeSide;

    public Triangle(int oneSide, int twoSide, int threeSIde, String color) {
        super(color);
        this.oneSide = oneSide;
        this.twoSide = twoSide;
        this.threeSide = threeSIde;
    }

    @Override
    public double area() {
        return (oneSide* threeSide)/2;
    }

    @Override
    public double perimeter() {
        return oneSide + twoSide + threeSide;
    }
}
