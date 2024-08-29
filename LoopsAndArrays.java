// sV 29Aug2024
/*
* LoopsAndArrays.java
*
* This program will use the for loop to loop through
* a list of names stored in a string array
*
 */



import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("\nWelcome to my Friendly For Loop Program");

        // Create a for loop that displays 'Hello there!' five times
        // The loop control variable of this for loop is named i (it means integer/a whole number)
        //This loop control variable must be: initialized, checked, and changed.
        for (int i = 0; i <= 10; i++) {
            System.out.println("\nThe value of i is: " + i);

        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10){
            System.out.println("\nThe value of loopControlVariable is: " + loopControlVariable);
            //Change the loop control variable
            loopControlVariable++;
        }

        // Create a string array of five words
        // String[] names = new String[10];
        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // Create an int array with 10 elements

        int[] myNumbers = new int[10];

        for (int i = 0; i < 10; i++); {

            System.out.println("\nPlease enter number " + i+1);
            myNumbers[i] scanner.nextInt();

        }

        //Output the myNumbers[] array with a for loop using the length property
        for (int i=0; i<10; i++) {
            System.out.println("The value of myNumbers is: " + myNumbers);
        }




        System.out.println("\nOne of our names is: " + names[4]);

        //Output the length of our array named name.
        System.out.println("\nThe length of our array 'names' is: " + names.length);

        //Create a for loop that outputs all elements values in the names array.
        for (int i = 0; i < names.length; i++)
            System.out.println("names[" + i + "] is... " + names[i]);

        System.out.println("\nThis is the end of the program.");

    }
}