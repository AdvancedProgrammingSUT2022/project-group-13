package Database.Units;

import Database.Block.Tile;
import Database.Civilization.City;

public class ArcherUnit extends MilitaryUnit{
    public void rangeAttack(Tile tile) {}
    public void isInRange(Tile tile) {
     //will be boolean
    }
    public void attackToCity(City city) {}


    public ArcherUnit(int XP, boolean isSleep, boolean isOnFortify, boolean isOnAlert, boolean isOnGarrison, int range, int lastActionTurn, int HP, int mana, Tile tile, int combatStrength, int COST) {
        super(XP, isSleep, isOnFortify, isOnAlert, isOnGarrison, range, lastActionTurn, HP, mana, tile, combatStrength, COST);
    }
}