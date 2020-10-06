package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        File file1 = new File("src/main/resources/missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter(file1);
        int countofzero = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] shoes = line.split(";");
            if (Integer.parseInt(shoes[2]) == 0) {
                printWriter.write(Arrays.toString(shoes));
            }
        }
        printWriter.close();

    }
}
