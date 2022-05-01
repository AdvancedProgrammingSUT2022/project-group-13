package Database.Building;

import Database.Block.TerrainType;

import java.util.ArrayList;

public class Improvement {


    public final int food;
    public final int gold;
    public final int production;
    public final Technology neededTech;
    public final ArrayList<TerrainType> possibleTerrains;

    Improvement(int food, int production, int gold, Technology neededTech, ArrayList<TerrainType> possibleTerrains){
        this.food=food;
        this.gold=gold;
        this.production=production;
        this.neededTech=neededTech;
        this.possibleTerrains=possibleTerrains;
    }

}
