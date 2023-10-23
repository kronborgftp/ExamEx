package One;

import java.util.*;

public class Tekst {

    Scanner keyboard = new Scanner(System.in);


    ArrayList<String> tekstLinjer = new ArrayList<>();

    public void add() {
        String user = keyboard.nextLine();

        tekstLinjer.add(user);
    }

    public void iterate() {


            for (String tekst : tekstLinjer) {
                System.out.println(tekst);
            }

    }

    public void unique() {
        ArrayList<String> uniqueString = findUniqueStrings(tekstLinjer);

        for(String u : uniqueString) {
            System.out.println(uniqueString);
        }
    }

    private ArrayList<String> findUniqueStrings(ArrayList<String> tekstLinjer) {

        //Hashset doesnt allow duplicates
        HashSet<String> uniqueSet = new HashSet<>(tekstLinjer);

        ArrayList<String> uniqueString = new ArrayList<>(uniqueSet);

        return uniqueString;
    }


}
