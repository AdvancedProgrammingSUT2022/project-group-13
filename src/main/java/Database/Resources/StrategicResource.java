package Database.Resources;

public class StrategicResource extends Resource {
    public StrategicResource(String type) {
        if (type.equals("Coal")) setFields("Coal", 0, 1, 0, "Mine", "SCIENTIFIC_THEORY");
        else if (type.equals("Horse")) setFields("Horse", 0, 1, 0, "Pasture", "Animal_Husbandry");
        else if (type.equals("Iron")) setFields("Iron", 0, 1, 0, "Mine", "Iron_Working");
    }

}
