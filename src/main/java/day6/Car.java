package day6;

/*
Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль, задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int GetYear() {
        return this.year;
    }

    public String GetColor() {
        return this.color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public String GetModel() {
        return this.model;
    }

    public void SetModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль " + GetModel() + " " + GetColor() + " " + GetYear());
    }

    public int yearDifference(int year) {
        return this.year - year;
    }

}
