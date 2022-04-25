package Database.Block;

public class TerrainFeature {
    protected String state;
    protected int movementcost;
    protected int gold;
    protected int food;
    protected int production;
    protected float combatmodifier;
    protected boolean ismovingpossible;

    public TerrainFeature(String state) {
        this.state = state;
        if (state.equals("FloodPlains"))
            this.setFields(1, 0, 2, 0, 33/100, true);
        else if (state.equals("Ice"))
            this.setFields(0, 0, 0, 0, 0, false);
        else if (state.equals("Forest"))
            this.setFields(1, 0, 1, -1, -25 / 100, true);
        else if (state.equals("Jungle"))
            this.setFields(2, 0, 1, 1, -25 / 100, true);
        else if (state.equals("Marsh"))
            this.setFields(2, 0, -1, 0, 33/100, true);
        else if (state.equals("Oasis"))
            this.setFields(1, 1, 3, 0, 33 / 100, true);
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
}
