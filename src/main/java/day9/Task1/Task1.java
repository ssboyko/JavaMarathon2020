package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Вася", "ИТ21А");
        Teacher teacher = new Teacher("Василий Иванович", "Дискретная математика");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
