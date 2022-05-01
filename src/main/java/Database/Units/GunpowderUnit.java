package Database.Units;

import Database.Block.Tile;

public class GunpowderUnit extends MilitaryUnit{

    public GunpowderUnit(int XP, boolean isSleep, boolean isOnFortify, boolean isOnAlert, boolean isOnGarrison, int range, int lastActionTurn, int HP, int mana, Tile tile, int combatStrength, int COST) {
        super(XP, isSleep, isOnFortify, isOnAlert, isOnGarrison, range, lastActionTurn, HP, mana, tile, combatStrength, COST);
    }
}
