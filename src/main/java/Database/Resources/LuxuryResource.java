package Database.Resources;

public class LuxuryResource extends Resource {
    public LuxuryResource(String type) {
        if (type.equals("Cotton")) setFields("Cotton", 0, 0, 2, "Farming", null);
        else if (type.equals("Color")) setFields("Color", 0, 0, 2, "Farming", null);
        else if (type.equals("Fur")) setFields("Fur", 0, 0, 2, "Camp", null);
        else if (type.equals("Jewel")) setFields("Jewel", 0, 0, 3, "Mine", null);
        else if (type.equals("Gold")) setFields("Gold", 0, 0, 2, "Mine", null);
        else if (type.equals("Incense")) setFields("Incense", 0, 0, 2, "Farming", null);
        else if (type.equals("Ivory")) setFields("Ivory", 0, 0, 2, "Camp", null);
        else if (type.equals("Marble")) setFields("Marble", 0, 0, 2, "Quarry", null);
        else if (type.equals("Silk")) setFields("Silk", 0, 0, 2, "Farming", null);
        else if (type.equals("Silver")) setFields("Silver", 0, 0, 2, "Mine", null);
        else if (type.equals("Sugar")) setFields("Sugar", 0, 0, 2, "Farming", null);
    }
}
