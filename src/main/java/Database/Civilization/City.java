package Database.Civilization;

import java.util.ArrayList;

import Database.Block.TerrainType;
import Database.Block.Tile;
import Database.Units.MilitaryUnit;

public class City {


    //////////////////Numberal    Properties
    private int happiness;
    private int food;
    private int gold;
    private int production;
    private int health;
    private int fightingPower;
    private String name;
    //////////////////////////




    //////////////////Object properties
    private Civilization ownership;
    private MilitaryUnit garrisonUnit;
    private Tile location;
    private ArrayList<Citizen> citizens = new ArrayList<>();
    private ArrayList<Tile> tiles = new ArrayList<>();
    private boolean beingcapital;
    ////////////////////////////////




    public City(int gold, int food, Tile location) {
        this.gold = gold;
        this.food = food;
        this.location = location;
        this.fightingPower=0;
        ///////still labouring doubts about fighting power
    }


    ////////////////////////////////getters
    public int getFood() {
        return food;
    }

    public ArrayList<Citizen> getCitizens() {
        return citizens;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public Civilization getOwnership() {
        return ownership;
    }

    public double getFightingPower(int turn) {
        double fightingPower=this.fightingPower;
        if (this.getLocation().getMilitaryUnit().isOnGarrison()){
            for (int i = this.getLocation().getMilitaryUnit().getLastActionTurn();i<turn;i++){
                fightingPower = 1.25 * fightingPower;
            }
        }
        return fightingPower;
    }

    public int getGold() {
        return gold;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    public int getProduction() {
        return production;
    }

    public MilitaryUnit getGarrisonUnit() {
        return garrisonUnit;
    }

    public Tile getLocation() {
        return location;
    }
    //////////////////////////////////




    ////////////remove and add citizen

    public void removeCitizen(Citizen citizen) {
        citizens.remove(citizen);
    }
    public void addCitizen() {
        citizens.add(new Citizen(this));
    }

    //////////////////////////////////



    public void addTile(Tile tile) {
        tiles.add(tile);
    }


    ///////////////////////assigning
    public void relieveCitizenFromWork(Citizen citizen){
        citizen.setonTile(null);
        citizen.getonTile().setCitizen(null);
    }

    private Citizen findCitizenToAssign(){
        int index = (int)(Math.random() * citizens.size());
        if(citizens.get(index).isWorking())
            return findCitizenToAssign();
        return citizens.get(index);
    }
    public void assignCitizen(Tile tile) {
        Citizen citizen = findCitizenToAssign();
        citizen.assignToTile(tile);
    }
    //////////////////////////////////////////
}
