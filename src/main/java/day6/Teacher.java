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

        String evaluation = "";
        switch (mark) {
            case (5):
                evaluation = "отлично";
                break;
            case (4):
                evaluation =  "хорошо";
                break;
            case (3):
                evaluation = "удовлетворительно";
                break;
            case (2):
                evaluation = "неудовлетворительно";
                break;
            default:
                System.out.println("Неправильная оценка");
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + evaluation);
    }
}
