package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2006);
        car.SetColor("Gray");
        car.SetModel("Mitsubishi Outlander");

        car.info();
        System.out.println(car.yearDifference(2004));

        Motorbike bike = new Motorbike(2010, "Black", "Honda cbr1000rr");

        bike.info();
        System.out.println(bike.yearDifference(2008));
    }
}
