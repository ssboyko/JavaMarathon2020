package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List <Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0){
                    throw new Task2Exception();
                }
                Person person1 = new Person(person[0],Integer.parseInt(person[1]));
                persons.add(person1);
            }
            return persons;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (Task2Exception t){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }


}
