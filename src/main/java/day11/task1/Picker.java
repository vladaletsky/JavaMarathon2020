package day11.task1;

public class Picker implements Worker {

    Warehouse warehouse1;
    private int salary;

    public Picker(Warehouse warehouse) {
        warehouse1 = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        warehouse1.setCountPickedOrders(warehouse1.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse1.getCountPickedOrders() == 10000) {
            salary = salary + 70000;
        } else if (warehouse1.getCountPickedOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");
    }
}
