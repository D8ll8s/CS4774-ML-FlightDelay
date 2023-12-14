package com.sg.classroster.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO{

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
        int result = Integer.parseInt(myScanner.nextLine());
        return result;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int result = Integer.parseInt(myScanner.nextLine());
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = Integer.parseInt(myScanner.nextLine());
        }

        return result;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double result = Double.parseDouble(myScanner.nextLine());
        return result;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double result = Double.parseDouble(myScanner.nextLine());
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = Double.parseDouble(myScanner.nextLine());
        }

        return result;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float result = Float.parseFloat(myScanner.nextLine());
        return result;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float result = Float.parseFloat(myScanner.nextLine());
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = Float.parseFloat(myScanner.nextLine());
        }

        return result;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long result = Long.parseLong(myScanner.nextLine());
        return result;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long result = Long.parseLong(myScanner.nextLine());
        while (result <= min && result >= max){
            System.out.println(prompt);
            result = Long.parseLong(myScanner.nextLine());
        }

        return result;
    }
}
