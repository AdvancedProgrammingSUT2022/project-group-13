package ControllerTest;

import Controller.PlayerDataBase;
import org.junit.Test;
import Controller.User;

import java.util.ArrayList;

public class PlayerDataBaseTest {
    private PlayerDataBase playerDataBase = new PlayerDataBase();

    @Test
    public void saveDataTest() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("hossein", "hosi", "12345"));
        users.add(new User("reza", "razavi", "123Aa"));
        playerDataBase.setUsers(users);
        playerDataBase.saveData();
    }

    @Test
    public void loadDataTest() {
        playerDataBase.loadData();
    }

}
