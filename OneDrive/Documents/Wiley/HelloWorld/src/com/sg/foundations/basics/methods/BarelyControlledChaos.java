package com.sg.foundations.basics.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getColor(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColor(); // call color method again here
        int weight = getNumber(5,200); // call number method,
        // with a range between 5 - 200
        int distance = getNumber(10,20); // call number method,
        // with a range between 10 - 20
        int number = getNumber(10000,20000); // call number method,
        // with a range between 10000 - 20000
        int time = getNumber(2,6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");


    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???

    public static String getColor(){
        String[] arr = {"red","orange","yellow","green","blue"};
        Random rand = new Random();
        int index = rand.nextInt(5);
        return arr[index];



    }

    public static String getAnimal(){
        String[] arr = {"tiger","dragon","cat","dog","mouse"};
        Random rand = new Random();
        int index = rand.nextInt(5);
        return arr[index];



    }

    public static int getNumber(int lower, int upper){
        Random rand = new Random();
        int index = rand.nextInt(upper - lower) + lower;
        return index;



    }
}