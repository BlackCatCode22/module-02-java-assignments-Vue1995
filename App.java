public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to classes and object-oriented programming");

        Student myStudent1 = new Student();
        myStudent1.firstName = "Dennis";
        myStudent1.lastName = "Mohle";
        myStudent1.major = "History";
        myStudent1.gpa = 3.4;
        myStudent1.age = 64;
        myStudent1.onProbation = true;

        // Output some stuff about our new object
        System.out.println("\nThe first name of out student is: " + myStudent1.firstName);

        // Create two more students
        Student myStudent2 = new Student();
        Student myStudent3 = new Student();

        myStudent3.major = "History";
        myStudent2.age = 44;

        // How many students?
        System.out.println("\nThere were " + Student.numOfStudents + " Student objects created.");

        //Create a phone object
        Phone myNewPhone = new Phone();
        myNewPhone.model = "AppleSE";
        myNewPhone.numOfCameras = 1;

        System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " camera.");

        Cat myCat = new Cat();
        myCat.catName = "Stewie";
        myCat.age = 3;
        myCat.livesRemaining = 1;
        System.out.println("\nMeow");
        System.out.println("\nMy cat " + myCat.catName + " is " + myCat.age + " years old");

        }
    }
