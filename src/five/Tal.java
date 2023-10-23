package five;
import java.util.ArrayList;
import java.util.Random;

public class Tal {
    private ArrayList<Integer> randomNumber = new ArrayList<>();

    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public void lavMangeTal() {
        randomNumber.clear();
        for(int i = 0; i < 10; i++) {
            int randomNum = generateNumber();
            randomNumber.add(randomNum);
        }
    }

    public ArrayList<Integer> getRandomNumber() {
        return randomNumber;
    }


}
