package day11;

import java.io.PipedInputStream;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
        }
        for (int i = 0; i < 999; i++) {
            courier.doWork();
        }

        System.out.println(warehouse.getBalance());
        System.out.println(warehouse.getCountOrder());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        System.out.println("Второй склад");

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        picker1.doWork();
        courier1.doWork();
        System.out.println(warehouse1.getBalance());
        System.out.println(warehouse1.getCountOrder());

        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());
    }
}
