package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14Task1TextFile");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            scanner.close();
            int length = numbersString.length;

            int[] numbers = new int[length];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double avg = (double) sum / numbers.length;
            System.out.print(avg + " --> ");
            System.out.printf("%1.3f", avg);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
