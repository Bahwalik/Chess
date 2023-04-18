import java.util.ArrayList;
import java.util.List;

public class ScriptsRegistry {

    List<Script> scripts = new ArrayList();

    public List<Script> getScripts() {
        return scripts;
    }
    public ScriptsRegistry(List<Script> scripts) {
        this.scripts = scripts;
    }
}
