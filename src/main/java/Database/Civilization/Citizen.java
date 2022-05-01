package Database.Civilization;

import Database.Block.Tile;

public class Citizen {
    private City currentCity;
    private boolean isWorking;
    private Tile onTile;


///////////////constructor
    public Citizen(City currentCity) {
        this.currentCity = currentCity;
        isWorking = false;
    }
//////////////////////////

 //////////////Tile stuff
    public void assignToTile(Tile tile) {
        if (isWorking) onTile.setCitizen(null);
        isWorking = true;
        tile.setCitizen(this);
        onTile = tile;
    }
    public void setonTile(Tile onTile) {
        this.onTile = onTile;
    }
    public Tile getonTile() {
        return onTile;
    }
////////////////////////////


    ///////////////////////////////workstuff
    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
///////////////////////////////////////



////////////////////////Citystuff
    public City getCity() {
        return currentCity;
    }

    public void setCity(City currentCity) {
        this.currentCity = currentCity;
    }
/////////////////////////////////////


    public void diminish() {
        currentCity.removeCitizen(this);
        onTile.setCitizen(null);
    }
}