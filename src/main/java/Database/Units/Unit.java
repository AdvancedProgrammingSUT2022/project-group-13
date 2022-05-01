package Database.Units;


import Database.Block.Tile;

public class Unit {
    private int HP;
    private int mana;
    private Tile tile;
    private int combatStrength;
    public final int COST;

    public Tile getTile() {
        return tile;
    }

    Unit(int HP, int mana, Tile tile, int COST, int combatStrength) {
        this.HP = HP;
        this.mana =mana;
        this.tile = tile;
        this.COST = COST;
        this.combatStrength = combatStrength;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getMana() {
        return mana;
    }

    public int getCombatStrength() {
        return combatStrength;
    }

    public void istheTileVisible(int x, int y) {
        //will be boolean l8er
    }
    public void move(Tile tile){
        this.tile = tile;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}