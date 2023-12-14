import java.util.Random;
import java.util.Scanner;



public class LuckySeven {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        int myDollars = myScanner.nextInt();

        Random rand = new Random();
        int maxEarned = 100;
        int quitOnRoll = 0;
        int roll = 0;


        boolean isNotBankrupt = true;

        while (isNotBankrupt){
            roll = roll + 1;


            int combinedRoll = DiceRoll.roll();

            if (combinedRoll == 7){
                myDollars = myDollars + 4;
                if (myDollars > maxEarned){
                    maxEarned = myDollars;
                    quitOnRoll = roll;
                }
            }
            else{
                myDollars = myDollars - 1;
                if(myDollars < 1){
                    isNotBankrupt = false;
                }
            }


        }

        System.out.println("Maximum profit:"+maxEarned);
        System.out.println("You should have quit on:"+quitOnRoll);
        System.out.println("You are bankrupt after:"+roll);


    }
}
