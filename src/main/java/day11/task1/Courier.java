package day11.task1;

public class Courier implements Worker {

    Warehouse warehouse1;
    private int salary;

    public Courier(Warehouse warehouse) {
        warehouse1 = warehouse;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse1.setCountDeliveredOrders(warehouse1.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse1.getCountDeliveredOrders() == 10000) {
            salary = salary + 50000;
        } else if (warehouse1.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");
    }
}
