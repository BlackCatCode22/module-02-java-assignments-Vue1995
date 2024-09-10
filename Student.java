public class Student {
    public static int numOfStudents = 0;

    // Create a constructor for our new objects
    public Student() {
        numOfStudents++;
    }

    // Give our Student class a few fields
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;
}
