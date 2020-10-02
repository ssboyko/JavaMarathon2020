package day11;

public class Courier implements Worker {
    private int salary;
    Warehouse warehouse;

    public Courier() {

    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() % 1000000 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary = salary * 2;
    }
}
