package pdn.scs.lab4_packages.school;

import pdn.scs.lab4_packages.school.student.Student;

import java.util.Scanner;

public class School
{
    // Since the Scanner object will be used in multiple methods, let's create it as a class variable.
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        Student st1 = new Student("John", 25, 4.0);
        Student st2 = new Student("James", 24, 3.7);
        Student st3 = new Student("Jane", 25, 3.9);

        // st1.name = "John";   This would throw an error since attributes with default access cannot be accessed
        // from outside the package. Creation of new Student objects is allowed because the class is declared as public.
        // A public class has a public constructor by default.

        Student st4 = createStudent();

        st1.printStudent();
        st2.printStudent();
        st3.printStudent();
        st4.printStudent();

        scan.close(); // Close the Scanner at the end of the program.
    }

    /**
     * This method prompts the user to enter a name for the student and returns the entered String.
     * @return The user-given value for the name of the Student.
     */
    static String takeName()
    {
        System.out.println("Enter the name of the student: ");
        String name = scan.next();
        return name;
    }

    /**
     * This method prompts the user to enter an age for the student and returns the entered int.
     * @return The user-given value for the age of the Student.
     */
    static int takeAge()
    {
        System.out.println("Enter the age of the student: ");
        int age = scan.nextInt();
        return age;
    }

    /**
     * This method prompts the user to enter a GPA for the the student and returns the entered double.
     * @return The user-given value for the GPA of the student.
     */
    static double takeGPA()
    {
        System.out.println("Enter the GPA of the student: ");
        double gpa = scan.nextDouble();
        return gpa;
    }

    /**
     * This method creates a new Student.
     * Takes the name, age, and GPA of a Student as user inputs, creates a new Student object and returns it.
     * @return New Student object.
     */
    static Student createStudent()
    {
        String name = takeName();
        int age = takeAge();
        double gpa = takeGPA();

        Student st = new Student(name, age, gpa);
        return st;
    }
}
