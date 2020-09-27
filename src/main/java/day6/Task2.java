package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2012, 20000, 100000);
        airplane.info();
        airplane.setYear(2010);
        airplane.setLength(30000);
        airplane.fillUp(2000);
        airplane.info();
    }
}
