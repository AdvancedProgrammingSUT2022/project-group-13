package Database.Resources;

public abstract class Resource {
    protected int food;
    protected int production;
    protected int gold;
    protected String requiredImprovement;
    protected String requiredTechnology;
    protected String type;

    public void setFields(String type, int food, int production, int gold, String requiredImprovement, String requiredTechnology) {
        this.type = type;
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.requiredImprovement = requiredImprovement;
        this.requiredTechnology = requiredTechnology;
    }

    public int getGold() {
        return gold;
    }

    public int getProduction() {
        return production;
    }

    public int getFood() {
        return food;
    }

    public String getRequiredImprovement() {
        return requiredImprovement;
    }

    public String getRequiredTechnology() {
        return requiredTechnology;
    }
}
