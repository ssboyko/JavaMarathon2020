package day6;

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

    public void info() {
        System.out.print("Изготовитель: " + this.producer);
        System.out.print(", год выпуска: " + this.year);
        System.out.print(", длина: " + this.length);
        System.out.print(", вес: " + this.weight);
        System.out.print(", количество топлива в баке: " + getFuel());
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }


}
