package day9.Task2;

public class Triangle extends Figure {
    private double SideA;
    private double SideB;
    private double SideC;

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        SideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
    }

    @Override
    public double area() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    @Override
    public double perimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
