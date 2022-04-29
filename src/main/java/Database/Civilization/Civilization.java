package Database.Civilization;

import java.util.ArrayList;

import Database.User;
import Database.Block.Tile;
import Database.Units.Unit;

public class Civilization {
    private User user;
    private int goldamount;
    private int score;
    private City maincapital;
    private ArrayList<Tile> revealedtiles = new ArrayList<>();
    private int diplomaticcredit;
    private int happiness;
    private City Capital;
    private int year;
    private int trophycount;
    private ArrayList<City> cities = new ArrayList<>();
    private ArrayList<Unit> units = new ArrayList<>();

    public void nextTurn() {
    }
}
