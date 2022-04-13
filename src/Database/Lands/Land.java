package Database.Lands;

public class Land {

    protected String state;
    protected int movementcost;
    protected int numberofgolds;
    protected int madefood;
    protected int production;
    protected float deathrate;
    protected boolean ismovingpossible;

    public Land(String state) {
        this.state = state;
        if (state.equals("Ocean"))
            this.setFields(700, 0, 0, 0, 0, false);
        else if (state.equals("Desert"))
            this.setFields(1, 0, 0, 0, 33 / 100, true);
        else if (state.equals("Reeds"))
            this.setFields(1, 0, 2, 0, 33 / 100, true);
        else if (state.equals("Meadows"))
            this.setFields(2, 0, 0, 2, -25 / 100, true);
        else if (state.equals("Mountain"))
            this.setFields(700, 0, 0, 0, 0, false);
        else if (state.equals("Plains"))
            this.setFields(1, 0, 1, 1, 33 / 100, true);
        else if (state.equals("Antarctica"))
            this.setFields(1, 0, 0, 0, 33 / 100, true);
        else if (state.equals("Tondra"))
            this.setFields(1, 0, 1, 0, 33 / 100, true);
    }

    public void setFields(int movementcost, int numberofgolds, int madefood, int production, float deathrate,
            boolean ismovingpossible) {
        this.movementcost = movementcost;
        this.numberofgolds = numberofgolds;
        this.madefood = madefood;
        this.production = production;
        this.deathrate = deathrate;
        this.ismovingpossible = ismovingpossible;
    }
}
