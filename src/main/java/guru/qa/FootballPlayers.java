package guru.qa;

import java.util.LinkedList;
import java.util.List;

public class FootballPlayers {

    public List<String> players = new LinkedList<>();

    public FootballPlayers() {
    }

    // Добавление игрока
    public void addPlayer(String player) {
        players.add(player);
    }

    // Поиск игрока
    public void searchPlayer(String player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.contains(player)) {
                System.out.println("Player found! " + player);
                break;
            } else {
                System.out.println("Player not found! ");
            }
        }
    }

    // Удаление игрока
    public void deletePlayer(String player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.contains(player)) {
                players.remove(player);
                break;
            } else {
                System.out.println("Player not found! ");
            }
        }
    }

    // Вывод всех игроков
    public void showAllPlayers() {
        System.out.println("All players " + players);
    }
}
