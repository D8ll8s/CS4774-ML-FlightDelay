import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean userActive = true;
        UserIOImpl myUser = new UserIOImpl();

        while (userActive) {



            String operation = myUser.readString("What do you want to do? Add(a), Subtract(s), Multiplication(m), " +
                    "Division(d) or enter 'q' to Quit:");

            if (operation.equals("q")) {
                break;
            }


            int firstOperand = myUser.readInt("Enter your first operand");


            int secondOperand = myUser.readInt("Enter your second operand");

            SimpleCalculator myCalculator = new SimpleCalculator(firstOperand, secondOperand);


            double answer = 0;
            switch (operation) {
                case ("a"):
                    answer = myCalculator.add();
                    break;

                case ("s"):
                    answer = myCalculator.subtract();
                    break;

                case ("m"):
                    answer = myCalculator.multiplication();
                    break;

                case ("d"):
                    try {
                        answer = myCalculator.division();
                    } catch (ArithmeticException e) {
                        while (secondOperand == 0) {
                            myUser.print("Invalid operand.Cannot divide by 0.");


                            secondOperand = myUser.readInt("Enter a new divisor");

                            if (secondOperand != 0) {

                                SimpleCalculator mySecondCalculator = new SimpleCalculator(firstOperand, secondOperand);
                                answer = mySecondCalculator.division();
                                break;

                            }
                        }
                    }
                    break;
                default:
                    myUser.print("Please enter a valid operation.");
            }
            myUser.print(String.valueOf(answer));

        }
    }

}
