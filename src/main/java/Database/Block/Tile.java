package Database.Block;

import java.util.ArrayList;

import Database.Building.Building;
import Database.Units.Unit;

public class Tile {
    private TerrainType terraintype;
    private ArrayList<Building> buildings = new ArrayList<>();
    private ArrayList<Unit> units = new ArrayList<>();
    private boolean ismovingpossible;

    public Tile(TerrainType terraintype) {
        this.terraintype = terraintype;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

}
