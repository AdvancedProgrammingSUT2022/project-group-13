package Database.Building;

import java.util.ArrayList;
import java.util.Arrays;

public class Technology{
    private int cost;
    private String era;
    private ArrayList<Technology> prequisiteTechs;
    private String type;
    Technology(String type)
    {
        ////////////////////////Ancient Era
        if(type.equals("Agriculture"))
            setFields("Agriculture",20,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Animal_Husbandry"))
            setFields("Animal_Husbandry",35,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Archery"))
            setFields("Archery",35,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Bronze_Working"))
            setFields("Bronze_Working",55,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Calendar"))
            setFields("Calendar",70,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Masonry"))
            setFields("Masonry",55,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Mining"))
            setFields("Mining",35,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Pottery"))
            setFields("Pottery",35,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Wheel"))
            setFields("Wheel",55,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Trapping"))
            setFields("Trapping",55,"Ancient",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Writing"))
            setFields("Writing",55,"Ancient",new ArrayList<Technology>(Arrays.asList()));
/////////////////////////////////////////////


////////////////////////////////////////Classical
        if(type.equals("Construction"))
            setFields("Construction",100,"Classical",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Horse_Riding"))
            setFields("Horse_Riding",100,"Classical",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Smithing"))
            setFields("Smithing",150,"Classical",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Mathematics"))
            setFields("Mathematics",100,"Classical",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Philosophy"))
            setFields("Philosophy",100,"Classical",new ArrayList<Technology>(Arrays.asList()));
        ////////////////////////////////////////
        
        
        /////////////////////////////////Medieval
        if(type.equals("Chivalry"))
            setFields("Chivalry",440,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Civil_Service"))
            setFields("Civil_Service",400,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Currency"))
            setFields("Currency",250,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Education"))
            setFields("Education",440,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Engineerig"))
            setFields("Engineering",250,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Machinery"))
            setFields("Machinery",440,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Metal_Casting"))
            setFields("Metal_Casting",240,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Physics"))
            setFields("Physics",440,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Steel"))
            setFields("Steel",440,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("Theology"))
            setFields("Theology",250,"Medieval",new ArrayList<Technology>(Arrays.asList()));
        //////////////////////////////////////////////////////
        
        
        /////////////////////////////////////////////////////Renaissance
        if(type.equals("ACOUSTICS"))
            setFields("ACOUSTICS",650,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("ARCHAEOLOGY"))
            setFields("ARCHAEOLOGY",1300,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("BANKING"))
            setFields("BANKING",650,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("CHEMISTRY"))
            setFields("CHEMISTRY",900,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("ECONOMICS"))
            setFields("ECONOMICS",900,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("FERTILIZER"))
            setFields("FERTILIZER",1300,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("GUNPOWDER"))
            setFields("GUNPOWDER",680,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("METALLURGY"))
            setFields("METALLURGY",900,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("MILITARY_SCIENCE"))
            setFields("MILITARY_SCIENCE",1300,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("PRINTING_PRESS"))
            setFields("PRINTING_PRESS",650,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("RIFLING"))
            setFields("RIFLING",1425,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("SCIENTIFIC_THEORY"))
            setFields("SCIENTIFIC_THEORY",1300,"Renaissance",new ArrayList<Technology>(Arrays.asList()));
        ////////////////////////////////////////////


        //////////////////////////////////////////////Industrial
        if(type.equals("BIOLOGY"))
            setFields("BIOLOGY",1680,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("COMBUSTION"))
            setFields("COMBUSTION",2200,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("DYNAMITE"))
            setFields("DYNAMITE",1900,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("ELECTRICITY"))
            setFields("ELECTRICITY",1900,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("RADIO"))
            setFields("RADIO",2200,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("RAILROAD"))
            setFields("RAILROAD",1900,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("REPLACEABLE_PARTS"))
            setFields("REPLACEABLE_PARTS",1900,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("STEAM_POWER"))
            setFields("STEAM_POWER",1680,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        if(type.equals("TELEGRAPH"))
            setFields("TELEGRAPH",2200,"Industrial",new ArrayList<Technology>(Arrays.asList()));
        /////////////////////////////////////
    }
   public void setFields(String type,int cost, String era, ArrayList<Technology> prequisiteTechs){
        this.cost=cost;
        this.prequisiteTechs=prequisiteTechs;
        this.era=era;
        this.type=type;
    }
}