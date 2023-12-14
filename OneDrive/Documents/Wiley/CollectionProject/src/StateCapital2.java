import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class StateCapital2 {

    public static void main(String[] args) throws FileNotFoundException {



        HashMap<String,String> stateCapital = new HashMap<>();
        Scanner userInput = new Scanner(System.in);
        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("C:\\Users\\18048\\OneDrive\\Documents\\Wiley\\CollectionProject\\src\\StateCapitals.txt")));
// go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] split = currentLine.split("::",2);
            stateCapital.put(split[0].toString(),split[1].toString());

        }
        List<String> keysAsArray = new ArrayList<String>(stateCapital.keySet());
        System.out.println(keysAsArray);
        Random r = new Random();


        for (int i = 0; i < 5; i++){

            String state = keysAsArray.get(r.nextInt(keysAsArray.size()));
            System.out.println("What is the capital of " + state);
            String capital = userInput.nextLine();
            if (capital.equalsIgnoreCase(stateCapital.get(state))){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong the correct answer was: " + stateCapital.get(state));
            }
        }
    }
}
