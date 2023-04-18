public class Cell {


    private CellType cellType;
    private Position position;

    public Cell(CellType cellType, Position position) {
        this.cellType = cellType;
        this.position = position;
    }

    public CellType getCellType() {
        return cellType;
    }

    public Position getPosition() {
        return position;
    }
}
