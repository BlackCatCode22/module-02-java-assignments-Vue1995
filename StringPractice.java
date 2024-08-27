// sV 27Aug2024
// StringPractice.java


import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

        System.out.println("\nHello to my String Practice!\n");

        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Hello from my STRING practice program!";

        System.out.println("\n myPracticeStr is: " + myPracticeStr);


        // Use a few String methods
        // a method is an object-oriented language name for a function
        // methods always have a pair of parenthesis attached to them
        //Use the toUpperCase() method
        String myNewStr = "";
        myNewStr = myPracticeStr.toUpperCase();


        //Prove it...
        System.out.println("\nmyNewStr is: "  + myNewStr);


        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("\nmyNewStr is: "  + myNewStr);


        // use the length method
        // create an int variable because the length method returns an int
        int myInt = 0;

        // Find the Length of our string object
        myInt = myPracticeStr.length();

        //Prove it
        System.out.println("\nThe length of " + myPracticeStr + " is " + myInt);

        // Use .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");
        System.out.println("\nThe value of isItThere is: " + isItThere);

        //charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);
        System.out.println("\nThe char at index " + anotherInt + " is: " + myChar);

        //.indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\nThe index of STR is: " + mySecondInt);

        // .lastIndexOf
        int lastIndexOf;
        lastIndexOf = myPracticeStr.lastIndexOf("m");
        System.out.println("\nlastIndexOf is: " + lastIndexOf);

        // SubString!!
        String myLastStrObject;
        myLastStrObject = myPracticeStr.substring(0, myPracticeStr.indexOf("STR"));

        //Output it
        System.out.println("\nmyLastStrObject is: " + myLastStrObject);


    }
}