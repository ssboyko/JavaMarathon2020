package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        while (!"Stop".equals(city)) {
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    city = scanner.nextLine();
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    city = scanner.nextLine();
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    city = scanner.nextLine();
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    city = scanner.nextLine();
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    city = scanner.nextLine();
                    break;

            }
        }
    }
}

