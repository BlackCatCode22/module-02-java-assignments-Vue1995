// sV 05Sep2024
//madnessWithMethods.java


import java.util.Scanner;

public class madnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\nHello and welcome to Madness With Methods.");

        int userInputNumber = 0;

        userInputNumber = getUserInput();

        System.out.println("\n The user input the number: " + userInputNumber);
    }

    // Method to get a number from the user
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");

        // Read the integer input from the user
        int userInput = scanner.nextInt();
        return userInput;
    }

    //Method to compare two integers and return the largest
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        public static int compareTwoInts(int firstInt; int secondInt)


            // Find the largest of two ints
            int myFirstNum = 3;
            int mySecondNUm = 8;
            int largest = 0;
            // Call the method named compareTwoInts()
            largest = compareTwoInts(myFirstNum, mySecondNUm);
            System.out.println("\n The largest of " + myFirstNum + "and " + mySecondNUm + "is :" + largest);

        // Sum two ints
        int theSumOfTwoInts = 0;
        theSumOfTwoInts = sumTwoInts(myFirstNum, mySecondNUm);
        System.out.println("\nThe sum of " + myFirstNum + "and " + mySecondNUm + "is: " + theSumOfTwoInts);


    }
}