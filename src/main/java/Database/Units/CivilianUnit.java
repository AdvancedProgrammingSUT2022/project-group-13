package Database.Units;

import Database.Block.Tile;

public class CivilianUnit extends Unit{
    CivilianUnit(int HP, int mana, Tile tile, int combatStrength, int COST) {
        super(HP, mana, tile, combatStrength, COST);
    }
}
