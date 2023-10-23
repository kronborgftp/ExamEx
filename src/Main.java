import One.Tekst;
import Three.Rafle;
import Four.*;
import five.Tal;
import six.Tal2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Tekst t = new Tekst();
        t.add();
        t.iterate();
        t.unique();

        //three
        Rafle rafle = new Rafle(3);
        rafle.ryst();
        List<Integer> eye = rafle.se();
        System.out.println(eye);

        //Four--------------------------------------------
        Cykel cykel1 = new Cykel("Mærke1", "Blå", 500);
        Cykel cykel2 = new Cykel("Mærke2", "Rød", 600);
        //butik opret
        Butik b = new Butik();
        b.add(cykel1);
        b.add(cykel2);
        //udregn samlet pris
        double samletPris = b.samletLager();
        System.out.println(samletPris);

        //Five------------------------------------------------
        Tal tal = new Tal();
        tal.lavMangeTal();
        ArrayList<Integer> randomNum = tal.getRandomNumber();
        System.out.println(randomNum);

        //Six----------------------------------------------------
        Tal2 talObjekt = new Tal2();
        int søgTal = 66;
        int antalForekomster = talObjekt.countTal(søgTal);
        System.out.println("Antal forekomster af tallet " + søgTal + ": " + antalForekomster);

        double gennemsnit = talObjekt.gennemsnit();
        System.out.println("Gennemsnit af tallene i listen: " + gennemsnit);

    }


}