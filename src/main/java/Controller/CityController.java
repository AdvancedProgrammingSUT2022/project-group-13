package Controller;


import Database.Civilization.City;
import Database.Civilization.Citizen;
import Database.Cordination;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class CityController {


    public String showCityInfo(City city) {
        return city.getName() + city.getHappiness() + city.getOwnership() + city.getHealth() ;
    }



    public String moveCitizen(Matcher matcher,City city) {
        int firstX = Integer.parseInt(matcher.group("x"));
        int firstY = Integer.parseInt(matcher.group("y"));
        int secondX = Integer.parseInt(matcher.group("xx"));
        int secondY = Integer.parseInt(matcher.group("yy"));
        Cordination first = new Cordination(firstX, firstY);
        Cordination second = new Cordination(secondX, secondY);
        if (!first.isValidCoordination())
            return "coordinates are invalid";
        if (!second.isValidCoordination())
            return "coordinates are invalid";
        if (!city.getTiles().contains(first.getTile()))
            return "This Tile does not belong to you!";
        if (!city.getTiles().contains(second.getTile()))
            return "This Tile does not belong to you!";

        for (int i = 0; i < city.getCitizens().size(); i++) {
            if (city.getCitizens().get(i).getonTile() == first.getTile()) {
                city.getCitizens().set(i, new Citizen(city));
                return "Citizen Moved Successfully.";
            }
        }
        return "Citizen is not Working in origin!";
    }

    public String setCitizen(Matcher matcher,City city) {
        int x = Integer.parseInt(matcher.group("x"));
        int y = Integer.parseInt(matcher.group("y"));
        Cordination coordination = new Cordination(x, y);
        if (!coordination.isValidCoordination())
            return "Coordinates are invalid!";
        if (city == null)
            return "City Not Selected!";
        if (!city.getTiles().contains(coordination.getTile()))
            return "This Tile does not belong to you!";

        for (int i = 0; i < city.getCitizens().size(); i++) {
            if (city.getCitizens().get(i) == null) {
                city.getCitizens().set(i, new Citizen(city));
                return "Citizen set.";
            }
        }
        return "None citizen is free to set.";
    }

}