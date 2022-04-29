package Controller;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class GamePageController {
    private PlayerDataBase playerDataBase;

    public GamePageController(PlayerDataBase playerDataBase) {
        this.playerDataBase = playerDataBase;
    }

    public void PlayGame(ArrayList<User> players) {
        System.out.println("Game played");
    }

    public PlayerDataBase getPlayerDataBase() {
        return playerDataBase;
    }
}
