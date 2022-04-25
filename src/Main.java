import Controller.LoginPageController;
import Controller.PlayerDataBase;
import View.LogInPageView;

public class Main {
    public static void main(String[] args) {
        PlayerDataBase playerDataBase = new PlayerDataBase();
        LogInPageView logInPageView = new LogInPageView(new LoginPageController(playerDataBase));
        logInPageView.showMenu();
    }
}
