package day4;
/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рамернсоть массива");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Содержимое массива");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Длина массива " + numbers.length);


        int moreThan8 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8) {
                moreThan8++;
            }
        }
        System.out.println("Количество чисел больше 8 : " + moreThan8);

        int numbersequals1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbersequals1++;
            }
        }
        System.out.println("Количество чисел равных 1 : " + numbersequals1);

        int evennumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evennumbers++;
            }
        }
        System.out.println("Количество четных чисел : " + evennumbers);

        int oddnumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddnumbers++;
            }
        }
        System.out.println("Количество нечетных чисел : " + oddnumbers);

        int sum = 0;
        // первое корявое решение
        // int temp = 0;
        // for (int i = 0; i < numbers.length-1; i++){
        //     if (i==0){
        //         sum = numbers[0];
        //         continue;
        //     }
        //     sum = sum + numbers[i+1];
        // }
        for (int x : numbers) {
            sum = sum + x;
        }
        System.out.println("Сумма всех элементов массива равны :" + sum);
    }
}
