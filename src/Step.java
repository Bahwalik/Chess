public class Step {
    private Figure figure;
    private Cell cell;
    private CommandValidator commandValidator;

    public Figure getFigure() {
        return figure;
    }

    public Cell getCell() {
        return cell;
    }

    public CommandValidator getCommandValidator() {
        return commandValidator;
    }

    public Player getPlayer() {
        return player;
    }

    private Player player;

}
