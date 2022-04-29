package Controller;

public class ProfilePageController {
    private PlayerDataBase playerDataBase;

    public ProfilePageController(PlayerDataBase playerDataBase) {
        this.playerDataBase = playerDataBase;
    }

    public void ChangeNickName (String newNickname) {
        playerDataBase.getLoggedInUser().setNickname(newNickname);
    }

    public  void ChangePassword(String newPassword) {
        playerDataBase.getLoggedInUser().setPassword(newPassword);
    }
    public PlayerDataBase getPlayerDataBase() {
        return playerDataBase;
    }
}
