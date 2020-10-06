package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException, Task2Exception {
        System.out.println(parseFileToStringList("people.txt"));
    }
    // считывает содержимое этого файла и возвращает список, состоящий из значений имен и возрастов каждого человека.

    public static List<String> parseFileToStringList(String FileName) throws IOException, Task2Exception {
        File file = new File(FileName);
        Scanner scanner = new Scanner(file);
        List<String> ArraylistOfPeople = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0){
                    throw new Task2Exception();
                }
                ArraylistOfPeople.add(line);

                //System.out.println(Arrays.toString(person));
            }
            return ArraylistOfPeople;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
             } catch (Task2Exception t){
                 System.out.println("Некорректный входной файл");
             }
            return null;
        }
    }

