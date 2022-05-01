package Database.Units;

import Database.Block.Tile;
import Database.Civilization.City;

public class SettlerUnit extends CivilianUnit {
    SettlerUnit(int HP, int mana, Tile tile, int combatStrength, int COST) {
        super(HP, mana, tile, combatStrength, COST);
    }
    public void searchForCity(Tile tile) {
        City city = new City(tile.getFood(),tile.getFood(),tile);
    }
}
