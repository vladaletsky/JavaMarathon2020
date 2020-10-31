package day6;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + "," + " год выпуска: " + year + "," + " длина: " + length + "," + " вес: " + weight + "," + " количество топлива в баке: " + fuel);
    }

    public void fillUp(int litres) {
        fuel = litres;

    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
