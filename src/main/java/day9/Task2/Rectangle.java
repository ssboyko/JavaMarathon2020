package day9.Task2;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;

    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

}
