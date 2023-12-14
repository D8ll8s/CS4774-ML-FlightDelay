package View;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UserIOConsoleImpl implements UserIO {

    private Scanner myScanner = new Scanner(System.in);
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String result = myScanner.nextLine();
        return result;

    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int result = myScanner.nextInt();
        return result;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int result = myScanner.nextInt();
        myScanner.nextLine();
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = myScanner.nextInt();
            myScanner.nextLine();
        }

        return result;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double result = myScanner.nextInt();
        myScanner.nextLine();
        return result;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double result = myScanner.nextDouble();
        myScanner.nextLine();
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = myScanner.nextDouble();
            myScanner.nextLine();
        }

        return result;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float result = myScanner.nextFloat();
        myScanner.nextLine();
        return result;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float result = myScanner.nextFloat();
        myScanner.nextLine();
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = myScanner.nextFloat();
            myScanner.nextLine();
        }

        return result;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long result = myScanner.nextLong();
        myScanner.nextLine();
        return result;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long result = myScanner.nextLong();
        myScanner.nextLine();
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = myScanner.nextLong();
            myScanner.nextLine();
        }

        return result;
    }
}
