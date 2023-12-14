package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();


        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many side does your die has");
        int side = Integer.parseInt(myScanner.nextLine());


        int rollResult = diceRoller.nextInt(side) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        if (rollResult == side){
            System.out.println("You roll a critical!");
        }

    }
}