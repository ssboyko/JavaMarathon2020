package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2010, "Black", "Honda cbr1000rr");
        System.out.println(bike.GetYear() + " " + bike.GetColor() + " " + bike.GetModel());
    }
}
