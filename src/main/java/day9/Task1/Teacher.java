package day9.Task1;

public class Teacher extends Human {
    private String subject;

    public String getSubjectName() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher (String name, String subject){
        super(name);
        this.subject = subject;
    }

    @Override
    public void printInfo (){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
