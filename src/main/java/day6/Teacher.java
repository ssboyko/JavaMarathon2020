package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student, int mark) {
        String rating = "";

        switch (mark) {
            case (5):
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку отлично");
                break;
            case (4):
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку хорошо");
                break;
            case (3):
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку удовлетворительно");
                break;
            case (2):
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку неудовлетворительно");
                break;
            default:
                System.out.println("Неправильная оценка");
        }
    }
}
