package Controller;

import View.GameView;
import View.ProfilePageView;

import java.util.regex.Matcher;

public class MainPageController {
    private PlayerDataBase playerDataBase;
    private ProfilePageController profilePageController;
    public MainPageController(PlayerDataBase playerDataBase) {
        this.playerDataBase = playerDataBase;
        profilePageController = new ProfilePageController(playerDataBase);
    }

    public void goToNextMenu(Matcher matcher) {
        String menu = matcher.group(5);
        if (menu.equals("Profile Menu")) {
            ProfilePageView profilePageView = new ProfilePageView(profilePageController);
            profilePageView.showMenu();
            return;
        }
        if (menu.equals("Game Menu"))
        {
            GameView gameView = new GameView(new GamePageController(playerDataBase));
            gameView.showMenu();
            return;
        }
    }

    public void Logout() {
        playerDataBase.setLoggedInUser(null);
    }

    public void playGame() {

    }
}


