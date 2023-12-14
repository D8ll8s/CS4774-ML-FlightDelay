package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        int range = 10;
        int counter = 1;
        Random rand = new Random();

        do {
            int chosen = rand.nextInt(range) + 1;

            System.out.println("Clean your room!! " + "(x" + counter + ")");
            if (chosen <= counter){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }


            if (counter == 7){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }

            counter = counter + 1;
        }
        while (counter < 8);


    }


}