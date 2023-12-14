import java.util.ArrayList;
import java.util.Collections;

public class Factor {



    public static ArrayList<Integer> calculateFactor(int userInput){
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 1; i < userInput + 1; i++){
            float quotient = userInput / i;
            if (userInput % i == 0 && quotient >= i){
                myArray.add(i);
                myArray.add((int) quotient);
            }
        }

        Collections.sort(myArray);
        return myArray;
    }
}
