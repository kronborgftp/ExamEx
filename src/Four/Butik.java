package Four;
import java.util.ArrayList;
import java.util.List;

public class Butik {
    private List<Cykel> lager = new ArrayList<>();

    public void add(Cykel cykel) {
        lager.add(cykel);
    }

    public double samletLager() {
        double samletPris = 0;
        for(Cykel c : lager) {
            samletPris += c.getPris();
        }
        return samletPris;
    }
}
