package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        System.out.println(car.yearDifference(1975));
        Motorbike motorbike = new Motorbike("Yamaha", "Blue", 2004);
        motorbike.info();
        System.out.println(motorbike.yearDifference(motorbike.getYear()));
    }
}
