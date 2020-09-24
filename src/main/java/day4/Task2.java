package day4;

import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int maxNumber = -1;
        for (int x : numbers) {
            if (maxNumber <= x) {
                maxNumber = x;
            }
        }
        System.out.println("Наибольший элемент массива равен : " + maxNumber);
        int minNumber = 10001;
        for (int x : numbers) {
            if (minNumber >= x) {
                minNumber = x;
            }
        }
        System.out.println("Наименьший элемент массива равен : " + minNumber);


        int zeroEndNumbers = 0;
        for (int x : numbers) {
            if (x % 10 == 0) {
                zeroEndNumbers++;
            }
        }
        System.out.println("Количество элементов, оканчивающихся на ноль : " + zeroEndNumbers);

        int zeroSumNumbers = 0;
        for (int x : numbers) {
            if (x % 10 == 0) {
                zeroSumNumbers = zeroSumNumbers + x;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0 : " + zeroSumNumbers);
    }
}
