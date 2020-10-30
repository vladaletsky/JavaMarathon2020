package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setModel("BMW");
        car.setColor("Black");

        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
    }
}
