package Database.Block;

public class TerrainType {
    protected String state;
    protected int movementcost;
    protected int gold;
    protected int food;
    protected int production;
    protected float combatmodifier;
    protected boolean ismovingpossible;
    protected TerrainFeature terrainfeature;

    public TerrainType(String state,TerrainFeature terrainfeature) {
        this.state = state;
        if (state.equals("Ocean"))
            this.setFields(700, 0, 0, 0, 0, false);
        else if (state.equals("Desert"))
            this.setFields(1, 0, 0, 0, 33 / 100, true);
        else if (state.equals("GrassLand"))
            this.setFields(1, 0, 2, 0, 33 / 100, true);
        else if (state.equals("Meadows"))
            this.setFields(2, 0, 0, 2, -25 / 100, true);
        else if (state.equals("Mountain"))
            this.setFields(700, 0, 0, 0, 0, false);
        else if (state.equals("Plains"))
            this.setFields(1, 0, 1, 1, 33 / 100, true);
        else if (state.equals("Antarctica"))
            this.setFields(1, 0, 0, 0, 33 / 100, true);
        else if (state.equals("Tundra"))
            this.setFields(1, 0, 1, 0, 33 / 100, true);
        this.terrainfeature=terrainfeature;
    }

    public void setFields(int movementcost, int gold, int food, int production, float combatmodifier,
            boolean ismovingpossible) {
        this.movementcost = movementcost;
        this.gold = gold;
        this.food = food;
        this.production = production;
        this.combatmodifier = combatmodifier;
        this.ismovingpossible = ismovingpossible;
    }

    public float getCombatmodifier() {
        return combatmodifier;
    }

    public int getFood() {
        return food;
    }

    public int getGold() {
        return gold;
    }

    public int getMovementcost() {
        return movementcost;
    }

    public int getProduction() {
        return production;
    }

    public String getState() {
        return state;
    }

    public TerrainFeature getTerrainfeature() {
        return terrainfeature;
    }
}
