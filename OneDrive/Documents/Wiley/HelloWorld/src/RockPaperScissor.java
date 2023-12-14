import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;


        while (playAgain){

            System.out.println("How many rounds do you want to play?");
            int roundQuantity = 0;
            int userWins = 0;
            int tieCount = 0;
            int computerWins = 0;


            boolean invalid = (roundQuantity > 10 || roundQuantity < 1);
            while(invalid) {
                System.out.println("Enter a number between 1-10");
                roundQuantity = myScanner.nextInt();
                if (roundQuantity < 10 || roundQuantity > 1) {
                    invalid = false;
                }
            }

            for (int i = 0; i < roundQuantity; i++){
                System.out.println("What is your choice?  1 = Rock, 2 = Paper, 3 = Scissors" );
                int choice = myScanner.nextInt();
                myScanner.nextLine();
                int computerChoice = rand.nextInt(3) + 1;

                String result = getResult(choice,computerChoice);
                switch (result){
                    case "cw":
                        System.out.println("Computer Wins!");
                        computerWins++;
                        break;
                    case "uw":
                        System.out.println("User Wins!");
                        userWins++;
                        break;
                    case "t":
                        System.out.println("Tie!");
                        tieCount++;
                        break;



                }

            }
            System.out.println("Computer Wins: " + computerWins);
            System.out.println("Ties: " + tieCount);
            System.out.println("User Wins: " + userWins);

            System.out.println("Do you want to play again? y/n");
            String userAgain = myScanner.nextLine();
            playAgain = userAgain.equals("y");
            System.out.println(playAgain);
        }


    }

    public static String getResult(int choice, int computerChoice){
        if (choice == 1){
            switch(computerChoice){
                case 1:
                    return "t";
                case 2:
                    return "cw";
                case 3:
                    return "uw";
            }
        }
        else if (choice == 2){
            switch(computerChoice){
                case 1:
                    return "uw";
                case 2:
                    return "t";
                case 3:
                    return "cw";
            }
        }
        else if (choice == 3){
            switch(computerChoice){
                case 1:
                    return "cw";
                case 2:
                    return "uw";
                case 3:
                    return "t";
            }
        }
        return "wrong";

    }
}
