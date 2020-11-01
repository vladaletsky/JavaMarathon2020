package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2004, 73, 280);
        airplane.setYear(2007);
        airplane.setLength(70);
        airplane.fillUp(100);
        airplane.fillUp(400); // проблема с двойным выводом
        airplane.info();
    }
}
