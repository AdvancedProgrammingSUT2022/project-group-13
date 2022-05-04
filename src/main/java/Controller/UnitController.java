package Controller;

import Database.Block.TerrainFeature;
import Database.Block.Tile;
import Database.Building.Improvement;
import Database.Building.Technology;
import Database.Civilization.City;
import Database.Civilization.Civilization;
import Database.Units.*;

public class UnitController {
        public class CreateUnitController {
                public boolean createUnit(Civilization civilization, Tile tile, String type) {
                        Unit unit = new Unit("type", tile, civilization);
                        civilization.getUnits().add(unit);
                        return addUnitToMap(unit);
                }
        }
        public boolean deleteUnit(Unit unit,Civilization civilization) {
                if(unit == null)
                        return false;
                civilization.getUnits().remove(unit);
                return removeUnitFromMap(unit,civilization);
        }

        private boolean removeUnitFromMap(Unit unit,Civilization civilization) {
                if(unit == null||unit.getTile()==null) return false;
                if(unit instanceof CivilianUnit)
                        unit.getTile().setCivilianUnit(null);
                else unit.getTile().setMilitaryUnit(null);
                //todo nameyesh hazf az map
                return true;
        }

        public boolean isUnitHomeTile(Unit unit, Tile tile,Civilization civilization){
                return unit.getTile().getOwner().equals(civilization);
        }

        public boolean moveUnit(Unit unit , Tile destination,Civilization civilization){
                if(civilization.isTileVisible(destination.getX(), destination.getY()) &&
                        destination.canPass()) {
                        unit.move(destination);
                        // todo namayesh harekat
                        return true;
                }


                else return false;
}


        public boolean addUnitToMap (Unit unit ){
                if(unit == null || unit.getTile() == null ) return false;
                if(unit instanceof CivilianUnit)
                        unit.getTile().setCivilianUnit((CivilianUnit) unit);
                else unit.getTile().setMilitaryUnit((MilitaryUnit) unit);
                // todo namayesh tasvir harekat kardan
                return true;
        }
        public void alertUnit(Civilization civilization)
        {
                Unit unit = civilization.getSelectedUnit();
                unit.alert();
        }
        public void awakeUnit(Civilization civilization)
        {
                Unit unit = civilization.getSelectedUnit();
                unit.wakeUp();
        }
        public void sleepUnit(Civilization civilization)
        {
                Unit unit =civilization.getSelectedUnit();
                unit.sleep();
        }
        public boolean unitFortify(Civilization civilization) {
                Unit unit =civilization.getSelectedUnit();
                if(unit == null) return false;
                if(unit instanceof CivilianUnit||
                unit  instanceof MountedUnit ||
                unit instanceof ArcherUnit)
                        return false;
                unit.fortify();
                return true;
        }


        public boolean unitFortifyUntilHealed(Civilization civilization) {
                Unit unit = civilization.getSelectedUnit();
                if(unit == null|| unit instanceof CivilianUnit)
                        return false;
                //unit.setAction("fortify_Until_Healed");
                return true;
        }

        public boolean unitGarrison(Civilization civilization)
        {
                Unit unit = civilization.getSelectedUnit();
                if(unit == null) return false;
                City city = unit.getTile().getCity();
                if (!city.getOwnership().equals(civilization)) return false;
                unit.garrison();
                return true;
        }

        public boolean unitFoundNewCity(Civilization civilization)
        {
                int var = 10;
                City city;
                if (civilization == null)
                        return false;
                Unit unit = civilization.getSelectedUnit();
                if (!(unit instanceof SettlerUnit))
                        return false;

                Tile target = unit.getTile();
                if (target == null || target.getCity()!=null)
                        return false;
                do {
                       // city = new City(City.getCityName(RANDOM.nextInt()), civilization, target);

                } while (/*!CityController.addCity(city) &&*/ var --> 0);
                if (var < 0)
                        return false;
                ((SettlerUnit) unit).searchForCity(target);
                return true;
        }
        public boolean unitBuildImprovement(Civilization civilization, Improvement improvement)
        {
                Unit unit = civilization.getSelectedUnit();
                if(unit == null)
                        return false;
                Tile tile = unit.getTile();
                if (tile == null )
                        return false;

                if(!civilization.hasTechnology(improvement.neededTech))
                        return false;
                if(tile.getTerrainFeature().equals("Forest")|| tile.getTerrainFeature().equals("Jungle") || tile.getTerrainFeature().equals("Marsh") )
                        return false;


                if(improvement.type.equals("Farm")) {
                        if(tile.getTerrainFeature().equals("Ice"))
                                return false;
                        unit.setAction("Build_Farm");
                }
                if(improvement.type.equals("Mine")){
                        if(!tile.getTerrainType().equals("Hill"))
                                return false;
                        unit.setAction("BuildMine");
                }
                if(improvement.type.equals("Trading_Post")) {
                        if(!civilization.hasTechnology("Trapping"))
                                return false;
                        unit.setAction("Build_Trading_Post");
                }
                if(improvement.type.equals("Lumber_Mill")) {
                        if(!civilization.hasTechnology("Construction"))
                                return false;
                        unit.setAction("Build_Lumber_Mill");
                }
                if(improvement.type.equals("Pasture")) {
                        if(!civilization.hasTechnology("Animal_Husbandry"))
                        unit.setAction("Build_Pasture");
                }
                if(improvement.type.equals("Camp")) {
                        if(!civilization.hasTechnology("Trapping"))
                                return false;
                        unit.setAction(UnitType.UnitAction.BUILD_CAMP);
                }
                if(improvement.type.equals("Plantation")) {
                        if(!civilization.hasTechnology("Calendar") )
                                return false;
                        unit.setAction("Build_Plantation");
                }
                if(improvement.type.equals("Quarry")) {
                        if(!civilization.hasTechnology("Engineerig"))
                                return false;
                        unit.setAction("Build_Quarry");
                }
                return true;
        }




        }

