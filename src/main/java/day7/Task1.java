package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2004, 35, 250);
        Airplane airplane1 = new Airplane("Airbus", 2005, 87, 280);
        Airplane.compareAirplanes(airplane, airplane1);
    }
}