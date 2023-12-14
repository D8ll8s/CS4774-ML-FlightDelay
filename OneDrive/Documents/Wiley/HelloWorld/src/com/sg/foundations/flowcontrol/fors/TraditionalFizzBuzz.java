package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        int count = Integer.parseInt(myScanner.nextLine());

        int fbCount = 0;

        for( int i = 1; i <= 5 * count; i++){
            if (i % 3 == 0 ) {
                System.out.print("fizz ");
                fbCount++;
            }
            if ( i % 5 == 0){
                System.out.print("buzz");
                fbCount++;
            }
            if (!(i % 3 == 0 ) && !( i % 5 == 0)){
                System.out.print(i);
            }
            System.out.println();

            if ( fbCount >= count){
                System.out.println("TRADITION!!!!!");
                break;
            }

        }

    }
}