// sV 03Sep2024
// ForEachArrays.java



public class forEachArrays {
    public static void main(String[] args) {


        System.out.println("\nWelcome to my For : Each practice!\n");

        // Create an array of cars. Do this two different ways and be able to explain to your lab partner.
        // Create a cars array using initialization
        String[] cars = {"BMW", "Tesla", "Honda"};

        //Output the cars array using a for each loop
        for (int i = 0; i <= 2; i++); {
            System.out.println(cars[0]);
        }
        System.out.println("\nMy for loop is done\n");

        // Use a for : each loop to do the same thing.
        for(String car : cars) {
            System.out.println(car);
        }

        // Create a String array using the new operator
        // Create a 4 element String array named myCars
        String[] myCars = new String[4];

        // myCars[0] to myCars[3]
        // Fill the newly created String[] array with data
        myCars[0] = "Tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        //Use a for : each loop to output
        for (String myCar : myCars){
            System.out.println("\nA car in myCars[] array is: " + myCar);
        }

        String[] myStrings = new String[6];

        /*

        // Use a for loop fill the array with some string
        for (int i = 0; i < 6; i++){
            // Fill my array with strings
            myStrings[i] = "This is string number: " + (i + 1);
        }

        */

        int aNum = 0;
        for (String aStr : myStrings){
            // Fill my array with strings
            myStrings[aNum] = "This is string number: " + (aNum + 1);
            aNum++;

        }

        // Now use a for : each loop to output the myStrings[] array.
        for (String aStr : myStrings) {
            System.out.println("\nAn element in myString is: " + aStr);

            // Let's reverse a string
            String myStrToReverse = "abcdefg";

            //Output the chars of myStrtoReverse
            for (int i =0; i < 7; i++) {
                System.out.println("\nmyStrToReverse[" + i + "] is: " + myStrToReverse.charAt(i) );
            }
            System.out.println("End of initial output.");

            // Create the reverse string
            String reversedStr = "";
            // Output reversedStr
            System.out.println("\nreversedStr before reversion loop is: " + myStrToReverse);

            for (int i =6; i > 0; i--){
                char charToAdd = myStrToReverse.charAt(i);
                reversedStr = reversedStr.concat(Character.toString(charToAdd));
            }
            // Output reveredStr
            System.out.println("\nreversedStr after reversion loop is: " + reversedStr);
        }
    }
}