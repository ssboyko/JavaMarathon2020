package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n>=1 && n <=4){
            System.out.println("Малоэтажный дом");
        }
        else if (n>=5 && n <=8){
            System.out.println("Среднеэтажный дом");
        }
        else if (n >= 9){
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
}
