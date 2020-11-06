package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println("Колличетво собранных заказов: " + warehouse.getCountPickedOrders());
        System.out.println("Колличетво доставленных заказов: " + warehouse.getCountDeliveredOrders());
        System.out.println("ЗП сборщика: " + picker.getSalary());
        System.out.println("ЗП курьера: " + courier.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
