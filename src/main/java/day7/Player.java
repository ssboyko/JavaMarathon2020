package day7;

import java.util.Random;

public class Player {
    Random random = new Random();
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public Player() {
        if (countPlayers < 6) {
            this.stamina = 90 + random.nextInt(MAX_STAMINA - 90 + 1);
            countPlayers++;
        } else {
            System.out.println("Создано достаточно игроков для игры на поле");
        }

    }

    public static void run(Player player) {
        if (player.stamina == MIN_STAMINA) {
            System.out.println("Я устал, мне нужна замена, ухожу с поля");
            countPlayers--;
        }
        player.stamina -= 1;

    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        }
    }
}
