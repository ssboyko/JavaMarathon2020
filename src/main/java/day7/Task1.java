package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2012, 20000, 100000);
        Airplane airplane2 = new Airplane("Boeing", 2012, 21000, 100000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}