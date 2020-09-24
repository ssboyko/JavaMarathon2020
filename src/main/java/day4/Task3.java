package day4;

import java.util.Arrays;
import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7     // сумма - 18
1 2 5 6 2     // сумма - 16
3 4 9 6 4    // сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        //создаём массив, который будет хранить суммы элементов строки
        int sum = 0;
        int[] sums = new int[12];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            sums[i] = sum;
            //System.out.println("sum = " + sum);
            sum = 0;
        }

        //находим максимальный элемент в полученном массиве, выводим его индекс.
        int maxNumber = -1;
        int index = 0;

        //for (int x : sums) {
        //    if (maxNumber <= x) {
        //        maxNumber = x;
        //        index = sums[x];
        //    }
        //}

        for (int i = 0; i < sums.length; i++) {
            if (maxNumber <= sums[i]) {
                maxNumber = sums[i];
                index = i;
            }
        }

        System.out.println("Индекс строки с наибольшим значением " + index);
        
    }
}
