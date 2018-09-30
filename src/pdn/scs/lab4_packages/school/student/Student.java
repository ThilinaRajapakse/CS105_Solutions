package pdn.scs.lab4_packages.school.student;

/**
 * Represents a student at the school.
 * A student has a name, an age, and a gpa.
 */
public class Student
{
    String name;
    int age;
    double gpa;

    /**
     * Create a new Student object with the given values.
     * @param name Name of the Student
     * @param age Age of the Student
     * @param gpa GPA of the Student
     */
    public Student(String name, int age, double gpa)
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    /**
     * This method prints out the name, age, and GPA of the Student.
     */
    public void printStudent()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa + "\n\n");
    }
}
