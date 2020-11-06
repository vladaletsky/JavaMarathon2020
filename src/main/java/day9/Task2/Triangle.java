package day9.Task2;

public class Triangle extends Figure {

    private double oneSide, twoSide, threeSide;

    public Triangle(double oneSide, double twoSide, double threeSIde, String color) {
        super(color);
        this.oneSide = oneSide;
        this.twoSide = twoSide;
        this.threeSide = threeSIde;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - oneSide) * (halfP - twoSide) * (halfP - threeSide));
    }

    @Override
    public double perimeter() {
        return oneSide + twoSide + threeSide;
    }
}
