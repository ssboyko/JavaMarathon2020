package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int GetYear() {
        return year;
    }

    public String GetColor() {
        return color;
    }

    public String GetModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл " + GetModel() + " " + GetColor() + " " + GetYear());
    }

    public int yearDifference(int year) {
        int yearDifference = this.year - year;
        return yearDifference;
    }
}
