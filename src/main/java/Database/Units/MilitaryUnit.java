package Database.Units;


import Database.Block.Tile;

public class MilitaryUnit extends Unit{
    private int XP;
    private boolean isSleep;
    private boolean isOnFortify;
    private boolean isOnAlert;
    private boolean isOnGarrison;
    private final int RANGE;
    private int lastActionTurn;

    public MilitaryUnit(int XP, boolean isSleep, boolean isOnFortify, boolean isOnAlert, boolean isOnGarrison,
                        int range, int lastActionTurn, int HP, int mana, Tile tile, int combatStrength, int price){
        super(HP, mana, tile, price, combatStrength);
        this.XP = XP;
        this.isSleep = isSleep;
        this.isOnFortify = isOnFortify;
        this.isOnAlert = isOnAlert;
        this.isOnGarrison = isOnGarrison;
        this.RANGE = range;
        this.lastActionTurn = lastActionTurn;
    }
    public void sleep() {
        this.isSleep = true;
    }
    public void fortify() {
        this.isOnFortify = true;
    }
    public void alert() {
        this.isOnAlert = true;
    }
    public void garrison() {
        this.isOnGarrison = true;
    }
    public void wakeUp(){
        this.isSleep = false;
    }

    public int getLastActionTurn() {
        return lastActionTurn;
    }

    public boolean isOnGarrison() {
        return isOnGarrison;
    }

    public double getCombatStrength(int thisTurn) {
        double strength =this.getCombatStrength();
        if (this.isOnFortify){
            for (int i = lastActionTurn;i<thisTurn;i++){
                strength = 1.25 * getCombatStrength();
            }
        }
        else if (this.isOnGarrison){
            for (int i = lastActionTurn;i<thisTurn;i++){
                strength = 1.25 * getCombatStrength();
            }
        }
        strength = strength + strength * getTile().getCombatModifier();
        return strength;
    }

    public void move(Tile tile) {
        super.move(tile);
//this is different than rest
    }
}