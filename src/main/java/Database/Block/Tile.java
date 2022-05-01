package Database.Block;

import java.util.ArrayList;

import Database.Building.Improvement;
import Database.Civilization.Citizen;
import Database.Civilization.Civilization;
import Database.Units.CivilianUnit;
import Database.Units.MilitaryUnit;
import Database.Units.Unit;
import Database.Units.Worker;

public class Tile {
    private ArrayList<Border> borders=new ArrayList<Border>();

    private TerrainType terraintype;
    private Improvement improvement;

    private int X;
    private int Y;
    private Civilization owner;
    private MilitaryUnit militaryUnit;
    private CivilianUnit civilianUnit;
    private Citizen workingCitizen;
    private boolean ismovingpossible;

    ////////////constructor
    public Tile(TerrainType terraintype,int X,int Y) {
        this.X=X;
        this.Y=Y;
        this.terraintype = terraintype;
    }


    ////////////getting productive values
    public int getFood(){
        if (this.terraintype.getTerrainfeature().getState().equals("Forest")) return 1;
        int getfoodT=terraintype.food;
        if (this.terraintype.getTerrainfeature()!=null) getfoodT+=this.terraintype.getTerrainfeature().getFood();
        return getfoodT;
    }
    public int getProduction(){
        if (this.terraintype.getTerrainfeature().getState().equals("Forest")) return 1;
        int getProT=terraintype.production;
        if (this.terraintype.getTerrainfeature()!=null) getProT+=this.terraintype.getTerrainfeature().getProduction();
        return getProT;
    }
    public int getGold(){
        int getGoldT=terraintype.getGold();
        if (terraintype.getTerrainfeature()!=null) getGoldT+=terraintype.getTerrainfeature().gold;
        getGoldT+=countRivers();
        return getGoldT;
    }
    ///////////////////////////

    public double getCombatModifier() {
        double modif = this.terraintype.getCombatmodifier();
        if (this.terraintype.terrainfeature != null) modif += this.terraintype.terrainfeature.getCombatmodifier();
        return modif;
    }

    public double getMovementCost() {
        double cost = this.terraintype.getMovementcost();
        if (this.terraintype.terrainfeature != null) cost += this.terraintype.terrainfeature.getMovementcost();
        return cost;
    }


    public MilitaryUnit getMilitaryUnit() {
        return militaryUnit;
    }

    public CivilianUnit getCivilianUnit() {
        return civilianUnit;
    }

    public Citizen getWorkingCitizen() {
        return workingCitizen;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Worker getWorker() {
        if (civilianUnit instanceof Worker == true)
            return (Worker) civilianUnit;
        else
            return null;
    }

    ///////////////////owner getters and setters
    public Civilization getOwner() {
        return owner;
    }

    public void setOwner(Civilization owner) {
        this.owner = owner;
///////////////////////////////////




///////////////////////////landscape
    }
    private int countRivers(){
        int riverscount=0;
        for (Border Border : borders)
            if (Border.getisRiver()) riverscount++;
        return riverscount;
    }
    public boolean canPass() {
        return (this.terraintype.getIsmovingpossible() || this.terraintype.getTerrainfeature().getIsmovingpossible());
    }
    public boolean canSeeOver(){
        if (!terraintype.getIsvisible()) return false;
        else
        return terraintype.getTerrainfeature()==null || terraintype.getTerrainfeature().getIsvisible();
    }
    public Tile getAdjTile(int i)
    { return borders.get(i).getOtherSide(this);}
//////////////////////////////////////



    public void setCitizen(Citizen workingCitizen) {
        this.workingCitizen = workingCitizen;
    }



}

