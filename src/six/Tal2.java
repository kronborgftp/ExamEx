package six;
import five.Tal;

import java.util.ArrayList;
public class Tal2 {

    private ArrayList<Integer> talListe;

    public Tal2() {
        talListe = new ArrayList<>();
        talListe.add(5);
        talListe.add(66);
        talListe.add(12);
        talListe.add(87);
        talListe.add(66);
        talListe.add(56);
        talListe.add(89);
        talListe.add(66);
    }

    public int countTal(int searchTal) {
        int antalForekomster = 0;
        for (int tal : talListe) {
            if (tal == searchTal) {
                antalForekomster++;
            }
        }
        return antalForekomster;
    }

    public double gennemsnit() {
        int sum = 0;
        for (int tal : talListe) {
            sum += tal;
        }
        return (double) sum / talListe.size();
    }

}
