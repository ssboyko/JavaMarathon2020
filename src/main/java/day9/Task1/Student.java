package day9.Task1;

public class Student extends Human {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo (){
        System.out.println("Это человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + getName());
    }

}
