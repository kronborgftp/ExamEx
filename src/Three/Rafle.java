package Three;

import java.util.*;

public class Rafle {
    //dices
    private int antal;
    //values
    private List<Integer> terninger;

    public Rafle(int antal) {
        this.antal = antal;
        terninger = new ArrayList<>();
        for (int i = 0; i < antal; i++) {
            terninger.add(1);
        }
    }

    public int ryst() {
        int eyes = 0;
        Random random = new Random();

        for( int i = 0; i < antal; i++) {
            int kast = random.nextInt(6) + 1;//simulate dice roll
            terninger.set(i, kast);
            eyes += kast;
        }

        return eyes;
    }

    public List<Integer> se() {
        return terninger;
    }
}
