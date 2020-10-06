package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Task1Exception {
        File file = new File("day14Task1TextFile");
        printSumDigits(file);

    }
    public static void printSumDigits (File file) throws Task1Exception {


        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            scanner.close();
            if (numbersString.length != 10) {
                throw new Task1Exception();
            }
            int[] numbers = new int[10];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    }

