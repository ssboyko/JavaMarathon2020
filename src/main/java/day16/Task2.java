package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();

        File file2 = new File("file2.txt");
        PrintWriter pw1 = new PrintWriter(file2);
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        String[] array = new String[1000];
        String line = br.readLine();
        int i = 0;
        while (line != null && i < array.length) {
            array[i++] = line;
            line = br.readLine();
        }
        Integer[] nums = new Integer[1000];
        for (int x = 0; x < 1000; x++) {
            nums[x] = Integer.parseInt(array[x]);
        }
        double sum = 0;
        for (int x = 0; x < nums.length; x++) {
            sum += nums[x];
            i++;
            if (i % 20 == 0) {
                pw1.println(sum / i);
                i = 0;
            }
        }
        pw1.close();


        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0.0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] array = line.split(", ");
            Double[] nums = new Double[array.length];
            nums[0] = Double.parseDouble(array[0]);
            sum += nums[0];
        }
        scanner.close();
        int x = (int) sum;
        System.out.println(x);
    }
}
