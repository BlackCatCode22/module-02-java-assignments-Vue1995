// sV 19Sep2024
// Main.java
// Driver file for Animal and Hyena classes usage

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\nWelcome to my Zoo Program!\n");

        // Open the arriving animals file.
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("\"C:\\Users\\BE218\\CIT 63\\arrivingAnimals.txt\""));
            String myLine;

            // Read the file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Create an Animal object
        Animal myAnimalObject = new Animal();

        // Use our new Animal object to set their age and output the statement
        myAnimalObject.setAge(4);
        System.out.println("\nMy animal's age is " + myAnimalObject.getAge() + " years old.");

        // Create a Hyena object
        Hyena myNewHyena = new Hyena();

        //Output the age of our Hyena
        myNewHyena.setAge(7);
        System.out.println("\nThe age of our hyena is " + myNewHyena.getAge() + " years old.");

        // Create a Lion object
        Animal Simba = new Lion();

        // Set the Lion 12 years old and output its age.
        Simba.setAge(12);
        System.out.println("\nSimba is " + Simba.getAge() + " years old.");

        // Output the number of animals
        System.out.println("\nThe number of animals created is: " + Animal.numOfAnimals);


        }
    }