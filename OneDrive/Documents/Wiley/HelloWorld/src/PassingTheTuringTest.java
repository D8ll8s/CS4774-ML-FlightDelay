import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("What's your name? ");

        String name = myScanner.nextLine();

        System.out.println("Hi," + name + "! I'm Alice.");

        System.out.println("What's your favorite color? ");

        String color = myScanner.nextLine();
        System.out.println("Hi," + name + "! I'm Alice.");

    }
}
