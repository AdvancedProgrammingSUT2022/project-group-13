package View;
public class MapDrawer {
    public static void main(String[] args){
        String[] map= new String[27];
        String WHITE = "\u001B[37m";
        String PURPLE = "\u001B[35m";
        String BLUE = "\u001B[34m";
        String YELLOW = "\u001B[33m";
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String BLACK = "\u001B[30m";
        String RESET = "\u001B[0m";
        String RED_BACKGROUND = "\u001B[41m";
        String BLACK_BACKGROUND = "\u001B[40m";
        String GREEN_BACKGROUND = "\u001B[42m";
        String YELLOW_BACKGROUND = "\u001B[43m";
        String BLUE_BACKGROUND = "\u001B[44m";
        String PURPLE_BACKGROUND = "\u001B[45m";
        String COLD_BACKGROUND = "\u001B[46m";
        String WHITE_BACKGROUND = "\u001B[47m";
        map = drawTile(BLUE_BACKGROUND,0,0,"A",RED,"c",BLACK,"S",PURPLE,"j",WHITE_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,0,1,"A",RED,"c",BLACK,"S",PURPLE,"j",RED_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,0,2,"A",RED,"c",BLACK,"S",PURPLE,"j",BLUE_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,0,3,"A",RED,"c",BLACK,"S",PURPLE,"j",RED_BACKGROUND,RESET,map,false,false,false,false);
        map[24]="           ";
        map[25]="           ";
        map[26]="           ";
        map = drawTile(BLUE_BACKGROUND,1,0,"A",RED,"c",BLACK,"S",PURPLE,"j",YELLOW_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,1,1,"A",RED,"c",BLACK,"S",PURPLE,"j",WHITE_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,1,2,"A",RED,"c",BLACK,"S",PURPLE,"j",YELLOW_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,1,3,"A",RED,"c",BLACK,"S",PURPLE,"j",COLD_BACKGROUND,RESET,map,false,false,false,false);
        map[0]+="           ";
        map[1]+="           ";
        map[2]+="           ";
        map = drawTile(BLUE_BACKGROUND,2,0,"A",RED,"c",BLACK,"S",PURPLE,"j",GREEN_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,2,1,"A",RED,"c",BLACK,"S",PURPLE,"j",BLACK_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,2,2,"A",RED,"c",BLACK,"S",PURPLE,"j",BLUE_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,2,3,"A",RED,"c",BLACK,"S",PURPLE,"j",RED_BACKGROUND,RESET,map,false,false,false,false);
        map[24]+="           ";
        map[25]+="           ";
        map[26]+="           ";
        map = drawTile(BLUE_BACKGROUND,3,0,"A",RED,"c",BLACK,"S",PURPLE,"j",PURPLE_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,3,1,"A",RED,"c",BLACK,"S",PURPLE,"j",COLD_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,3,2,"A",RED,"c",BLACK,"S",PURPLE,"j",YELLOW_BACKGROUND,RESET,map,false,false,false,false);
        map = drawTile(BLUE_BACKGROUND,3,3,"A",RED,"c",BLACK,"S",PURPLE,"j",COLD_BACKGROUND,RESET,map,false,false,false,false);
        map[0]+="           ";
        map[1]+="           ";
        map[2]+="           ";
        printMap(map);
        changeMapCivilization(map,3,3,"W",RED);
        printMap(map);
    }
    public static String[] drawTile(String riverColor,int x, int y, String civilization, String civilizationColor, String millitayUnit, String millitaryUnitColor, String otherUnit, String otherUnitColor, String feature, String terrainColor, String RESET,String[] map,boolean rightupRiver,boolean rightdownRiver, boolean leftdownRiver, boolean leftupRiver) {
        int cord=6*y;
        if(x%2==1)
            cord+=3;
            if (map[0 + cord] == null){
                if(leftupRiver)
                map[0 + cord] ="  " + riverColor + "/" + RESET + terrainColor + "     " + RESET;
                else
                    map[0 + cord] ="  /" + terrainColor + "     " + RESET;}
            else{
                if(leftupRiver)
                    map[0 + cord] +="  " + riverColor + "/" + RESET + terrainColor + "     " + RESET;
                else
                    map[0 + cord] +="  /" + terrainColor + "     " + RESET;}
            if (map[1 + cord] == null){
                if(leftupRiver)
                    map[1 + cord] =" " + riverColor + "/" + RESET + terrainColor + "   " + civilizationColor + civilization + "   " + RESET;
                else
                    map[1 + cord] =" /" + terrainColor + "   " + civilizationColor + civilization + "   " + RESET;}
                else{
                if(leftupRiver)
                    map[1 + cord] +=" " + riverColor + "/" + RESET + terrainColor + "   " + civilizationColor + civilization + "   " + RESET;
                else
                    map[1 + cord] +=" /" + terrainColor + "   " + civilizationColor + civilization + "   " + RESET;}
            if (map[2 + cord] == null){
                if(leftupRiver)
                map[2 + cord] = riverColor + "/" + RESET + terrainColor + "   " + x + "," + y + "   " + RESET;
                else
                    map[2 + cord] ="/" + terrainColor + "   " + x + "," + y + "   " + RESET;}
            else {
                if (leftupRiver)
                    map[2 + cord] += riverColor + "/" + RESET + terrainColor + "   " + x + "," + y + "   " + RESET;
                else
                    map[2 + cord] += "/" + terrainColor + "   " + x + "," + y + "   " + RESET;
            }
            if (map[3 + cord] == null) {
                if (millitayUnit.isEmpty() && otherUnit.isEmpty()){
                    if(leftdownRiver)
                    map[3 + cord] = riverColor + "\\" + RESET + terrainColor + "         " + RESET;
                    else
                        map[3 + cord] = "\\" + terrainColor + "         " + RESET;}
                else if (millitayUnit.isEmpty()){
                    if(leftdownRiver)
                    map[3 + cord] = riverColor + "\\" + RESET + terrainColor + "    " + otherUnitColor + otherUnit + "    " + RESET;
                    else
                        map[3 + cord] = "\\" + terrainColor + "    " + otherUnitColor + otherUnit + "    " + RESET;}
                    else if (otherUnit.isEmpty()){
                        if(leftdownRiver)
                            map[3 + cord] = riverColor + "\\" + RESET + terrainColor + "    " + millitaryUnitColor + millitayUnit + "    " + RESET;
                        else
                            map[3 + cord] = "\\" + terrainColor + "    " + millitaryUnitColor + millitayUnit + "    " + RESET;}
                        else{
                            if(leftdownRiver)
                                map[3 + cord] = riverColor + "\\" + RESET + terrainColor + "   " + millitaryUnitColor + millitayUnit + " " + otherUnitColor + otherUnit + "   " + RESET;
                            else
                                map[3 + cord] = "\\" + terrainColor + "   " + millitaryUnitColor + millitayUnit + " " + otherUnitColor + otherUnit + "   " + RESET;}
            } else {
                if (millitayUnit.isEmpty() && otherUnit.isEmpty()){
                    if(leftdownRiver)
                        map[3 + cord] += riverColor + "\\" + RESET + terrainColor + "         " + RESET;
                    else
                        map[3 + cord] += "\\" + terrainColor + "         " + RESET;}
                else if (millitayUnit.isEmpty()){
                    if(leftdownRiver)
                        map[3 + cord] += riverColor + "\\" + RESET + terrainColor + "    " + otherUnitColor + otherUnit + "    " + RESET;
                    else
                        map[3 + cord] += "\\" + terrainColor + "    " + otherUnitColor + otherUnit + "    " + RESET;}
                else if (otherUnit.isEmpty()){
                    if(leftdownRiver)
                        map[3 + cord] += riverColor + "\\" + RESET + terrainColor + "    " + millitaryUnitColor + millitayUnit + "    " + RESET;
                    else
                        map[3 + cord] += "\\" + terrainColor + "    " + millitaryUnitColor + millitayUnit + "    " + RESET;}
                else{
                    if(leftdownRiver)
                        map[3 + cord] += riverColor + "\\" + RESET + terrainColor + "   " + millitaryUnitColor + millitayUnit + " " + otherUnitColor + otherUnit + "   " + RESET;
                    else
                        map[3 + cord] += "\\" + terrainColor + "   " + millitaryUnitColor + millitayUnit + " " + otherUnitColor + otherUnit + "   " + RESET;}
            }
            if (map[4 + cord] == null) {
                if (feature.isEmpty()){
                    if(leftdownRiver)
                    map[4 + cord] = " " + riverColor + "\\" + terrainColor + "       " + RESET;
                    else
                        map[4 + cord] = " \\" + terrainColor + "       " + RESET;}
                else{
                    if(leftdownRiver)
                    map[4 + cord] = " " + riverColor +"\\" + RESET + terrainColor + "   " + feature + "   " + RESET;
                    else
                        map[4 + cord] = " \\" + terrainColor + "   " + feature + "   " + RESET;}
                } else {
                if (feature.isEmpty()){
                    if(leftdownRiver)
                        map[4 + cord] += " " + riverColor + "\\" + terrainColor + "       " + RESET;
                    else
                        map[4 + cord] += " \\" + terrainColor + "       " + RESET;}
                else{
                    if(leftdownRiver)
                        map[4 + cord] += " " + riverColor +"\\" + RESET + terrainColor + "   " + feature + "   " + RESET;
                    else
                        map[4 + cord] += " \\" + terrainColor + "   " + feature + "   " + RESET; }}
            if (map[5 + cord] == null){
                if(leftdownRiver)
                map[5 + cord] ="  " + riverColor + "\\" +RESET + terrainColor + "_____" + RESET;
                else
                    map[5 + cord] ="  \\" + terrainColor + "_____" + RESET;}
            else{
                if(leftdownRiver)
                    map[5 + cord] +="  " + riverColor + "\\" +RESET + terrainColor + "_____" + RESET;
                else
                    map[5 + cord] +="  \\" + terrainColor + "_____" + RESET;}
            if (rightupRiver) {
                map[0 + cord] += riverColor + "\\" + RESET + "  ";
                map[1 + cord] += riverColor + "\\" + RESET + " ";
                map[2 + cord] += riverColor + "\\" + RESET;
            } else {
                map[0 + cord] += "\\" + "  ";
                map[1 + cord] += "\\" + " ";
                map[2 + cord] += "\\";
            }
            if (rightdownRiver) {
                map[5 + cord] += riverColor + "/" + RESET + "  ";
                map[4 + cord] += riverColor + "/" + RESET + " ";
                map[3 + cord] += riverColor + "/" + RESET;
            } else {
                map[5 + cord] += "/" + "  ";
                map[4 + cord] += "/" + " ";
                map[3 + cord] += "/";
            }
        return map;
    }
    public static void printMap(String[] map) {
        for (int i = 0; i < map.length; i++) {
            if(map[i]!=null)
            System.out.println(map[i]);
        }
    }

    public static void changeMapCivilization(String[] map,int x, int y,String Civilization, String CivilizationColor) {
        if(x==0)
            map[6*y+1]=map[6*y+1].substring(0,10)+CivilizationColor+Civilization+map[6*y+1].substring(16);
        else if(x==1&&y%2==0)
            map[6*y+4]=map[6*y+4].substring(0,30)+CivilizationColor+Civilization+map[6*y+4].substring(36);
        else if(x==1&&y%2==1)
            map[6*y+4]=map[6*y+4].substring(0,30)+CivilizationColor+Civilization+map[6*y+4].substring(36);
        else if(x==2&&y==0)
            map[6*y+1]=map[6*y+1].substring(0,46)+CivilizationColor+Civilization+map[6*y+1].substring(52);
        else if(x==2)
            map[6*y+1]=map[6*y+1].substring(0,55)+CivilizationColor+Civilization+map[6*y+1].substring(61);
        else if(x==3)
            map[6*y+4]=map[6*y+4].substring(0,75)+CivilizationColor+Civilization+map[6*y+4].substring(81);
    }
    public static void changeMillitaryUnit(String[] map,int x,int y,String millitaryUnit,String militaryUnitColor){
        if(x==0)
            map[6*y+3]=map[6*y+3].substring(0,9)+militaryUnitColor+millitaryUnit+map[6*y+3].substring(15);
        else if(x==1&&y!=3)
            map[6*y+6]=map[6*y+6].substring(0,34)+militaryUnitColor+millitaryUnit+map[6*y+6].substring(35);
        else if(x==1)
            map[6*y+6]=map[6*y+6].substring(0,20)+militaryUnitColor+millitaryUnit+map[6*y+6].substring(26);
        else if(x==2)
            map[6*y+3]=map[6*y+3].substring(0,59)+militaryUnitColor+millitaryUnit+map[6*y+3].substring(65);
        else if(x==3&&y!=3)
            map[6*y+6]=map[6*y+6].substring(0,79)+militaryUnitColor+millitaryUnit+map[6*y+6].substring(85);
        else if(x==3)
            map[6*y+6]=map[6*y+6].substring(0,61)+militaryUnitColor+millitaryUnit+map[6*y+6].substring(67);
    }
    public static void changeOtherUnit(String[] map,int x,int y,String otherUnit, String otherUnitColor){
        if(x==0)
            map[6*y+3]=map[6*y+3].substring(0,16)+otherUnitColor+otherUnit+map[6*y+3].substring(22);
        else if(x==1&&y!=3)
            map[6*y+6]=map[6*y+6].substring(0,36)+otherUnitColor+otherUnit+map[6*y+6].substring(42);
        else if(x==1)
            map[6*y+6]=map[6*y+6].substring(0,27)+otherUnitColor+otherUnit+map[6*y+6].substring(33);
        else if(x==2)
            map[6*y+3]=map[6*y+3].substring(0,66)+otherUnitColor+otherUnit+map[6*y+3].substring(72);
       else if(x==3&&y!=3)
            map[6*y+6]=map[6*y+6].substring(0,86)+otherUnitColor+otherUnit+map[6*y+6].substring(92);
       else if(x==3)
            map[6*y+6]=map[6*y+6].substring(0,68)+otherUnitColor+otherUnit+map[6*y+6].substring(74);
    }
}

