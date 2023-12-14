import java.util.Random;

public class DiceRoll {


    public static int roll(){
        Random rand = new Random();
        int newRoll1 = rand.nextInt(6) + 1;
        int newRoll2 = rand.nextInt(6) + 1;

        int combinedRoll = newRoll1 + newRoll2;
        return combinedRoll;
    }
}
