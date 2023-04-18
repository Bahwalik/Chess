import java.util.ArrayList;
import java.util.List;

public class Script {
    private Player player1;

    private Player player2;
    List<Step> steps = new ArrayList();

    public Script(Player player1, Player player2, List<Step> steps) {
        this.player1 = player1;
        this.player2 = player2;
        this.steps = steps;
    }
}
