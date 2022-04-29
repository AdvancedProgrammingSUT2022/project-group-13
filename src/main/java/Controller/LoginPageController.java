package Controller;

import java.util.regex.Matcher;

public class LoginPageController {
    private PlayerDataBase playerDataBase;

    public LoginPageController(PlayerDataBase playerDataBase) {
        this.playerDataBase = playerDataBase;
    }

    public boolean login(String username, String password) {
        User user = playerDataBase.getUser(username);
        if (user == null) return false;
        if (user.getPassword().equals(password)) {
            playerDataBase.setLoggedInUser(user);
            return true;
        }
        return false;
    }

    public void register (String username, String nickname, String password) {
        playerDataBase.addUser(new User(username, nickname, password));
    }

    public void goToNextView(Matcher matcher) {

    }

    public PlayerDataBase getPlayerDataBase() {
        return playerDataBase;
    }
}
