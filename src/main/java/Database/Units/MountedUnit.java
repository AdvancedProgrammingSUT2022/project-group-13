package Database.Units;

import Database.Block.Tile;

public class MountedUnit extends MilitaryUnit {
        public MountedUnit(int XP, boolean isSleep, boolean isOnFortify, boolean isOnAlert, boolean isOnGarrison, int range, int lastActionTurn, int HP, int mana, Tile tile, int combatStrength, int COST) {
            super(XP, isSleep, isOnFortify, isOnAlert, isOnGarrison, range, lastActionTurn, HP, mana, tile, combatStrength, COST);
        }
    }
