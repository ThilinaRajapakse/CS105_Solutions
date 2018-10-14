package pdn.scs.lab6_arrays.group_assignment.group;


import java.util.Scanner;

/**
 * The Group class represents a collection of marks.
 * For example, a group may consist of a set of students, each of whom may have their own marks.
 * The Group class has an integer array to hold all of these marks.
 */
public class Group
{
    private int[] marks;
    private static Scanner scanner = new Scanner(System.in); // Create a Scanner object to get user input. It is defined
                                                             // as static since each Group object doesn't require it's
                                                             // copy. It can be shared across all the objects.

    /**
     * The public constructor method initializes a Group object.
     * The Group object contains an integer array. This method creates the array and
     * assigns a reference to the array to the marks variable of the Group class.
     * @param size - The size or length of the array that should be created.
     */
    public Group(int size)
    {
        this.marks = new int[size]; // Create an integer array of the specified size and assign the reference to
                                    // the array to the marks attribute of the Group object.
    }

    /**
     * This method assigns values to the integer array.
     * This method takes in the marks that should be inserted to the array as user input. It should take in as many
     * values as is required to fill the array. E.g. If the array is of size 10, then it should take in 10 values.
     */
    public  void assign_marks()
    {
        for (int i = 0; i < this.marks.length; i++)
        {
            // Loop through the array and fill it with user input.
            System.out.println("Enter mark: "); // Prompt the user to enter a mark.
            this.marks[i] = scanner.nextInt(); // Take an integer from the user and insert it into the array.
        }
    }

    /**
     * This method prints out all the values inside the array.
     */
    public void print()
    {
        for (int i = 0; i < this.marks.length; i++)
        {
            System.out.println("Mark " + i + "= " + this.marks[i]);
        }
    }

    /**
     * This method calculates and prints out the average of the marks.
     */
    public void calculate_average()
    {
        int total = 0; // A local variable to store the total.
        for (int i = 0; i < this.marks.length; i++)
        {
            total += this.marks[i];
        }

        double avg = (double)total / this.marks.length;  // When calculating the average, at least one of the two
                                                        // operands needs to be a double. Otherwise, integer division
                                                        // is performed, resulting in an incorrect value.

        System.out.println("Average marks: " + avg);
    }


    /**
     * This methods finds and prints the highest value in the marks array.
     *
     * A local variable "highest" is declared to hold the currently found highest mark. It is initialized to 0, then
     * checked against each mark value in the array. If the current value in the array is greater than the current value
     * in highest, the highest variable is assigned the current value of the array.
     */
    public void find_highest()
    {
        int highest = 0;

        for (int i = 0; i < this.marks.length; i++)
        {
            if (marks[i] > highest)
            {
                highest = marks[i];
            }
        }

        System.out.println("The highest mark: " + highest);
    }
}
