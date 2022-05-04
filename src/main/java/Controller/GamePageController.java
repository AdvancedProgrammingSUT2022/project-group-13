package Controller;
import java.util.ArrayList;

public class GamePageController {
    private PlayerDataBase playerDataBase;

    public GamePageController(PlayerDataBase playerDataBase) {
        this.playerDataBase = playerDataBase;
    }

    public void PlayGame(ArrayList<User> players) {

    }

    public PlayerDataBase getPlayerDataBase() {
        return playerDataBase;
    }
}
