package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.SetYear(2006);
        car.SetColor("Gray");
        car.SetModel("Mitsubishi Outlander");
        System.out.println(car.GetModel() + " " + car.GetColor() + " " + car.GetYear());

    }
}
