package Controller;

import Database.Civilization.Civilization;

import java.util.ArrayList;

public class GameDatabase {
    static private ArrayList<User> players;
    static private ArrayList<Civilization> civilizations;

    static private User currentPlayer;
    private Civilization currentCivilization;

    private int id;

    // add main Map here as come as soon


    private static GameDatabase gameDatabase = null;



    public static GameDatabase getGameDatabase (ArrayList<User> players)
    {
        if (gameDatabase == null)
        {
            gameDatabase = new GameDatabase(players);
        }
        return gameDatabase;
    }


    public GameDatabase(ArrayList<User> players) {
        this.players = players;
        this.id = 0;
        setup();
    }

    public void setup()
    {
        //fill when mainMap implemented
    }

    public static ArrayList<User> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<User> players) {
        GameDatabase.players = players;
    }

    public static ArrayList<Civilization> getCivilizations() {
        return civilizations;
    }

    public static void setCivilizations(ArrayList<Civilization> civilizations) {
        GameDatabase.civilizations = civilizations;
    }

    public static User getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(User currentPlayer) {
        GameDatabase.currentPlayer = currentPlayer;
    }

    public Civilization getCurrentCivilization() {
        return currentCivilization;
    }

    public void setCurrentCivilization(Civilization currentCivilization) {
        this.currentCivilization = currentCivilization;
    }
}
