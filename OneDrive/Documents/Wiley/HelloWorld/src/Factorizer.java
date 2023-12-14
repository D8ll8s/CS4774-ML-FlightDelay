import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args){

        ArrayList<Integer> myArray = new ArrayList<>();



        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to factor? ");
        int userInput = input.nextInt();

        myArray = Factor.calculateFactor(userInput);

        for(int j : myArray){
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println(userInput + " has " + factorQuantity(myArray) + " factors");

        System.out.println(userInput +  perfectFactor(myArray) + "a perfect factor");

        System.out.println(userInput  + isPrime(myArray,userInput) + "a prime number");


    }

    public static int factorQuantity(ArrayList<Integer> factorArray){
        return factorArray.size();
    }

    public static String perfectFactor(ArrayList<Integer> factorArray){
        int sum = 0;
        for (int i = 0; i < factorArray.size() - 1; i++){
            sum += factorArray.get(i);

        }
        if (sum == factorArray.get(factorArray.size() - 1)){
            return " is ";
        }
        else {
            return " is not ";
        }
    }

    public static String isPrime(ArrayList<Integer> factorArray, int userInput){

        if (factorArray.get(0)== 1 && factorArray.get(1) == userInput){
            return " is ";
        }
        else {
            return " is not ";
        }
    }
}
