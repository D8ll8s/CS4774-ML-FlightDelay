import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalApp {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,StateCapital3> myMap = new HashMap<>();
        Scanner userInput = new Scanner(System.in);
        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("C:\\Users\\18048\\OneDrive\\Documents\\Wiley\\CollectionProject\\src\\MoreStateCapitals.txt")));


        // go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] split = currentLine.split("::");

            StateCapital3 myObject = new StateCapital3(split[1].toString(),Integer.parseInt(split[2]),Double.parseDouble(split[3]));
            myMap.put(split[0].toString(),myObject);


        }

        Collection<String> keySet = myMap.keySet();

        System.out.printf("%d STATE/CAPITAL PAIRS LOADED.", keySet.size());
        System.out.println();
        System.out.println("====================");
        for (String i : keySet){
            System.out.print(i + " - ");
            StateCapital3 tempObject = myMap.get(i);
            System.out.print(tempObject.getName() + " - ");
            System.out.print(tempObject.getPopulation() + " - ");
            System.out.print(tempObject.getAreaSqMile());
            System.out.println();

        }

        System.out.println("Please enter the lower limit for capital city population: ");
        int lowerLimit = userInput.nextInt();

        System.out.printf("LISTING CAPITALS WITH POPULATIONS GREATER THAN %d",lowerLimit);
        System.out.println();
        System.out.println("================================");
        System.out.println();
        for (String i : keySet){
            StateCapital3 tempObject = myMap.get(i);

            if (tempObject.getPopulation() > lowerLimit) {
                System.out.print(i + " - ");
                System.out.print(tempObject.getName() + " - ");
                System.out.print(tempObject.getPopulation() + " - ");
                System.out.print(tempObject.getAreaSqMile());
                System.out.println();
            }

        }

///////////////////////////////////////////////////////

        System.out.println("Please enter the upper limit for capital city sq mileage: ");
        int upperLimit = userInput.nextInt();

        System.out.printf("LISTING CAPITALS WITH AREAS LESS THAN %d",upperLimit);
        System.out.println();
        System.out.println("================================");
        System.out.println();
        for (String i : keySet){
            StateCapital3 tempObject = myMap.get(i);

            if (tempObject.getAreaSqMile() < upperLimit) {
                System.out.print(i + " - ");
                System.out.print(tempObject.getName() + " - ");
                System.out.print(tempObject.getPopulation() + " - ");
                System.out.print(tempObject.getAreaSqMile());
                System.out.println();
            }

        }


    }
}
