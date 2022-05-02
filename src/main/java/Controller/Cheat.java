package Controller;

public class Cheat {
    public static void goldCheat(User user, int gold) {
        user.setGold(gold);
    }

    public static void turnCheat(User user, int turns) {
        user.setTurns(turns);
    }
}
