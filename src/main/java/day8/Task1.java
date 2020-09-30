package day8;

/*
1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

 */
public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            sb.append(i).append(" ");
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(timeConsumedMillis);
        System.out.println(sb);

        String a;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            a = i + " ";
            System.out.print(a);
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}
