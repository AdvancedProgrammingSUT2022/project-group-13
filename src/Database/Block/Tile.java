package Database.Block;

import java.util.ArrayList;

import Database.Building.Building;

public class Tile {
    private TerrainType terraintype;
    private ArrayList<Building>buildings=new ArrayList<>();
    boolean ismovingpossible;
    public Tile(TerrainType terraintype)
    {
        this.terraintype=terraintype;
    }

}
