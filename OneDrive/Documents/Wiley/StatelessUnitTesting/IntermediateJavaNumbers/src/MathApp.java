import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        UserIOImpl io = new UserIOImpl();
        int firstOperand = io.readInt("Enter 1st operand");
        int secondOperand = io.readInt("Enter 2nd operand");

        int myMath = io.readInt("Enter Operation");

        switch (myMath){
            case 1:
                System.out.println(IntMath.calculate(MathOperator.PLUS,firstOperand,secondOperand));
                break;
            case 2:
                System.out.println(IntMath.calculate(MathOperator.MINUS,firstOperand,secondOperand));
                break;
            case 3:
                System.out.println(IntMath.calculate(MathOperator.MULTIPLY,firstOperand,secondOperand));
                break;
            case 4:
                System.out.println(IntMath.calculate(MathOperator.DIVIDE,firstOperand,secondOperand));
                break;

        }
    }
}
