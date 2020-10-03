package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mercedes");
        list.add("Audi");
        list.add("BMW");
        list.add("Porsche");
        list.add("Opel");

        System.out.println(list);

        list.add(2,"Land Rover");
        list.remove(0);
        System.out.println(list);
    }
}
