public class Step {
    private Figure figure;
    private Cell cell;
    private CommandValidator commandValidator;
    private Player player;

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
    public Step(Figure figure, Cell cell, CommandValidator commandValidator, Player player) {
        this.figure = figure;
        this.cell = cell;
        this.commandValidator = commandValidator;
        this.player = player;
    }
}
