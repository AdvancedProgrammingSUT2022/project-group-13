package Database.Civilization;

import java.util.ArrayList;
import java.util.HashMap;

import Database.Building.Technology;
import Database.Resources.Resource;
import Database.User;
import Database.Block.Tile;
import Database.Units.Unit;
public class Civilization {
    private final int WIDTH, HEIGHT;
    private ArrayList<Tile> tiles;
    private ArrayList<City> cities;
    private City capitalCity;
    private ArrayList<Technology> technologies;
    private HashMap<Resource, Integer> resources;
    private int happiness;
    private ArrayList<Unit> units;
    private Unit selectedunit;
    private boolean[][] fogOfWar;
    private boolean[][] Visible;
    private boolean visibleTileFindFlag;


    public Civilization(Tile tile, int WIDTH, int HEIGHT){
        this.capitalCity = new City(0, 0 , tile);
        this.fogOfWar = new boolean[WIDTH][HEIGHT];
        this.Visible = new boolean[WIDTH][HEIGHT];
        this.WIDTH=WIDTH;
        this.HEIGHT=HEIGHT;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public boolean hasTechnology(Technology technology) {
        if(!technologies.contains(technology))
        return false;
        else 
            return true;
    }

    public int countResource(Resource resource) {
        return resources.get(resource);
    }


////////////////////////////////Visibility stuff
    public void resetVisibleTiles(){ visibleTileFindFlag=false; }
    private void setVisible(Tile tile, int radius, boolean onHill, boolean[][] fogOfWar){
        assert(radius<=2);
        fogOfWar[tile.getX()][tile.getY()]=true;
        if (!tile.canSeeOver() && !onHill) return ;
        if (radius<=0) return ;
        for (int i=0; i<6; i++){
            Tile tile2=tile.getAdjTile(i);
            if (tile2==null) continue ;
            setVisible(tile2, radius-1, onHill, fogOfWar);
        }
    }
    public boolean isTileVisible(int x, int y){
        findVisibleTiles();
        return Visible[x][y];
    }
    private void findVisibleTiles(){
        if (!visibleTileFindFlag) return ;
        visibleTileFindFlag=true;
        for (int i=0; i<WIDTH; i++) for (int j=0; j<HEIGHT; j++) Visible[i][j]=false;
        for (Tile tile : tiles) setVisible(tile, 1, true, Visible);
        for (Unit unit: units) setVisible(unit.getTile(), 2, unit.getTile().canSeeOver(), Visible);
    }
    ////////////////////////////////////////////////


    ///////////////////////////////////Tile stuff
    public void addTile(Tile tile){
        resetVisibleTiles();
        tiles.add(tile);
        setVisible(tile, 1, true, fogOfWar);
    }
    public void removeTile(Tile tile){ tiles.remove(tile); }
    /////////////////////////////////////////////////////////


    public Unit getSelectedUnit() {
        return selectedunit;
    }

    public void setSelectedUnit(Unit selectedunit) {
        this.selectedunit = selectedunit;
    }
}
