package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
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

    public int getLength() {
        return length;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length +
                ", вес: " + this.weight + ", количество топлива в баке: " + getFuel());
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        }
        if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        }
        if (airplane1.getLength() == airplane2.getLength()) {
            System.out.println("Длины самолетов равны");
        }

    }

}
