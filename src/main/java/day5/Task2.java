package day5;

import org.w3c.dom.ls.LSOutput;

public class Task2 {
    public static void main(String[] args) {
    Motorbike motorbike = new Motorbike(2020,"Blue", "Yamaha");
        System.out.println("Год выпуска: " + motorbike.getYear());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Модель: " + motorbike.getModel());
    }
}
