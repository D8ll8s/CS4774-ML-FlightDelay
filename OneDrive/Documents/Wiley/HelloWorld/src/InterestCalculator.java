import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How much do you want to invest? ");
        float balance = myScanner.nextFloat();

        System.out.println("How many years are investing? ");
        int years = myScanner.nextInt();

        System.out.println("What is the annual interest rate % growth? ");
        float interestRate = myScanner.nextFloat();

        System.out.println("Calculating....");

        for(int i = 1; i < years +1 ; i++){
            System.out.printf("Year %d: ", i);
            System.out.println("Began with $" + df.format(balance));

            BigDecimal interestEarned = calculateEarnedInterest(balance,interestRate);
            System.out.println("Earned $" + interestEarned.setScale(2,RoundingMode.HALF_UP));

            balance = balance + interestEarned.floatValue();
            System.out.println("Ended with $" + df.format(balance));

            System.out.println();


        }



    }

    public static BigDecimal calculateEarnedInterest(float tempBalance, float interest){
        float quarterInterestRate = interest/4;
        float earned = 0;

        for (int i = 0; i < 4; i++){
            earned += tempBalance * quarterInterestRate / 100;
            tempBalance = tempBalance * (1 + quarterInterestRate / 100);
        }


        BigDecimal result = new BigDecimal(String.valueOf(earned));
        result = result.setScale(2,RoundingMode.HALF_UP);
        return result;
    }
}
