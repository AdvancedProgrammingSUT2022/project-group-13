package Database.Building;

import Database.Block.TerrainType;

import java.util.ArrayList;
import java.util.Arrays;

public class Improvement {


    private  int food;
    private  int gold;
    private  int production;
    private   String neededTech;
    private    ArrayList<TerrainType> possibleTerrains;
    private String type;
    private String neededtech;
    Improvement(String type)
    {
        if(type.equals("Camp"))
            setFields("Camp",0,0,0,"Trapping",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Farm"))
            setFields("Farm",1,0,0,"Agriculture",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Lumber_Mill"))
            setFields("Lumber_Mill",0,1,0,"Engineering",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Mine"))
            setFields("Mine",0,1,0,"Mining",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Pasture"))
            setFields("Pasture",0,0,0,"Animal_Husbandry",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Plantation"))
            setFields("Plantation",0,0,0,"Calendar",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Quarry"))
            setFields("Quarry",0,0,0,"Masonry",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Trading_Post"))
            setFields("Trading_Post",0,0,1,"Trapping",new ArrayList<TerrainType>(Arrays.asList()));
        if(type.equals("Manufactory"))
            setFields("Manufactory",0,2,0,"Engineering",new ArrayList<TerrainType>(Arrays.asList()));
    }

    public void setFields(String Type,int food, int production, int gold, String neededTech, ArrayList<TerrainType> possibleTerrains){
        this.type=type;
        this.food=food;
        this.gold=gold;
        this.production=production;
        this.neededTech=neededTech;
        this.possibleTerrains=possibleTerrains;
    }

}
