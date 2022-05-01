package Database.Units;


import Database.Block.Tile;
import Database.Civilization.City;

public class SiegeUnit extends MilitaryUnit{
    private Tile targetTile;

    public void preAttack(Tile tile) {

    }
    public void isInRange(Tile tile) {
//      will be boolean
    }
    public void attackToCity(City city) {

    }

    public SiegeUnit(int XP, boolean isSleep, boolean isOnFortify, boolean isOnAlert, boolean isOnGarrison, int range, int lastActionTurn, int HP, int MP, Tile tile, int combatStrength, int COST) {
        super(XP, isSleep, isOnFortify, isOnAlert, isOnGarrison, range, lastActionTurn, HP, MP, tile, combatStrength, COST);
    }
}