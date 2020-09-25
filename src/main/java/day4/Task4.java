package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int sumofelems = 0;
        int[] arrayofsums = new int[98];//массив, сожержащий максимальные тройки
        //заполняем этот массив, идём циклом с 1-го элемента до предпоследнего, чтобы пройтись по всем тройкам
        for (int i = 1; i < array.length - 1; i++) {
            sumofelems = array[i - 1] + array[i] + array[i + 1];
            arrayofsums[i - 1] = sumofelems;
        }
        //ищем максимум и его индекс, т.к. в цикле выше мы начинали со второго элемента, то индекс максимальной тройки и будет индексом максимальной суммы (сдвиг на 1)
        int index = 0;
        int Maxnumber = 0;
        for (int i = 0; i < arrayofsums.length; i++) {
            if (arrayofsums[i] >= Maxnumber) {
                Maxnumber = arrayofsums[i];
                index = i;
            }
        }
        System.out.println("Сумма максимальной тройки равна " + Maxnumber + " Индекс первого элемента тройки равен " + index);
        //System.out.println(Arrays.toString(arrayofsums));

        //Оптимальное решение из видео, ответы сходятся с моим решением

        //int maxSum = 0;
        //int maxSumIndex = 0;
        //for (int i = 0; i < array.length -2 ; i++){
        //    int sum = 0;
        //    for (int j = i; j < i + 3; j++){
        //        sum = sum + array[j];
        //    }
        //    if (sum > maxSum) {
        //         maxSum = sum;
        //         maxSumIndex = i;
        //    }
        //}
        //System.out.println("Сумма максимальной тройки равна " + maxSum + " Индекс первого элемента тройки равен " + maxSumIndex);
    }
}
