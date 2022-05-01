package Database.Units;

import Database.Block.Tile;

public class ArmoredUnit extends Unit{

    ArmoredUnit(int HP, int mana, Tile tile, int COST, int combatStrength) {
        super(HP, mana, tile, COST, combatStrength);
    }
}
