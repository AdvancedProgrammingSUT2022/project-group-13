package Database.Units;

import Database.Block.Tile;
import Database.Resources.StrategicResource;
import View.MapDrawer;

public class Unit {
    protected int cost;
    protected String combattype;
    protected int combaStrength;
    protected int rangedCombatStrength;
    protected int movement;
    protected StrategicResource requiredresources;
    protected int experiencepoint;
    protected int type;
    protected String location;
    protected String typename;
    protected Tile tile;
    public Tile getTile() {
        return tile;
    }
    public void setTile(Tile tile) {
        this.tile = tile;
    }
    public void fortify() {

    }

    public void fortifyFullHealth() {

    }

    public void increaseLevel() {

    }

    public void move(String[] map,int x,int y,String millitaryUnit,String millitaryUnitColor) {
                MapDrawer.changeMillitaryUnit(map, x, y, millitaryUnit, millitaryUnitColor);
    }

    public void sleep() {

    }

    public void beReady() {

    }

    public void Attack() {

    }

    public void defend() {

    }

    public void isReady() {

    }
    
    public void moveTo() {

    }
    
    public void remove() {
    }
    
    public void wakeUp() {

    }
    
    public void cancelOrder() {

    }
    
    public void foundcity() {

    }
    
    public void improveStrength() {

    }
    
    public void improveHealth() {

    }
    
    public void settle() {

    }
    
    public void plunder() {

    }
}
