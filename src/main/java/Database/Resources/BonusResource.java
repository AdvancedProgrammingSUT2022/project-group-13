package Database.Resources;

public class BonusResource extends Resource {
    public BonusResource(String Type) {
        if (type.equals("Banana")) setFields("Banana", 1, 0, 0, "Farming", null);
        else if (type.equals("Cow")) setFields("Cow", 1, 0, 0, "Pasture", null);
        else if (type.equals("Gazelle")) setFields("Gazelle", 1, 0, 0, "Camp", null);
        else if (type.equals("Sheep")) setFields("Sheep", 1, 0, 0, "Pasture", null);
        else if (type.equals("Wheat")) setFields("Wheat", 1, 0, 0, "Farm", null);
    }
}
