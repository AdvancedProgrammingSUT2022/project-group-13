package Database.Civilization;

import java.util.ArrayList;

import Database.Block.TerrainType;

public class City {
    private String name;
    private int happiness;
    private int food;
    private int gold;
    private int production;
    private Civilization ownership;
    private TerrainType location;
    private int health;
    private ArrayList<Citizen> citizens = new ArrayList<>();
}
