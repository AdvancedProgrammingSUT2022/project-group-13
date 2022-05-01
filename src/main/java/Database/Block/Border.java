package Database.Block;

public class Border {
    private Tile neigh1;
    private Tile neigh2;
    private boolean isriver;

    public Border(Tile neigh1, Tile neigh2, boolean isriver) {
        this.neigh1 = neigh1;
        this.neigh2 = neigh2;
        this.isriver = isriver;
    }

    public Tile getOtherSide(Tile tile) {
        if (tile.equals(neigh1))
            return neigh2;
        else
            return neigh1;
    }

    public boolean getisRiver() {
        return isriver;
    }
}
