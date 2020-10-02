package day11;

import java.nio.file.WatchKey;

public class Picker implements Worker {
    private int salary;
    Warehouse warehouse;

    public Picker() {

    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() % 1500 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary = salary * 3;
    }
}
