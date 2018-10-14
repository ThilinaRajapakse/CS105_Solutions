package pdn.scs.lab6_arrays.individual_assignment.matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The Matrix class represents a matrix using a 2D Java array.
 *
 * A Matrix object will have set dimensions defined at creation time.
 */
public class Matrix
{
    double[][] matrix;
    Scanner scanner = new Scanner(System.in);   // Not required in the assignment, but will be used to test the program.

    /**
     * The constructor method.
     *
     * Creates a Matrix object containing an array of the specified dimensions
     * @param m Number of rows of the matrix.
     * @param n Number of columns of the matrix.
     */
    public Matrix(int m, int n)
    {
        this.matrix = new double[m][n];
    }

    /**
     * Method to print out the Matrix.
     */
    public void print()
    {
        // We will be using two nested loops to access each element of the 2D array. The first loop iterates through
        // rows, while the second loop iterates through the columns. "matrix.length" yields the number of rows and
        // "matrix[i].length" yields the number of columns in row i.
        for (int i = 0; i < this.matrix.length; i++)
        {
            for (int j = 0; j < this.matrix[i].length; j++)
            {
                System.out.print(this.matrix[i][j] + " "); // Note the use of the print method instead of the println
                                                            // method.
            }
            System.out.println(); // Print a new line at the end of each row.
        }
    }

    /**
     * Method to get the dimensions of the matrix of the Matrix object.
     * @return Integer array containing the dimensions of the matrix.
     */
    public int[] get_dimensions()
    {
        int[] dims = new int[2];
        dims[0] = this.matrix.length;
        dims[1] = this.matrix[0].length;

        return dims;
    }

    /**
     * Method to add another matrix to the current matrix.
     * @param m2 The Matrix to be added to the current matrix.
     */
    public void add_matrix(Matrix m2)
    {
        // Checking whether the dimensions allow matrix addition.
        if (Arrays.equals(this.get_dimensions(), m2.get_dimensions())) // Arrays.equals() checks the equality of arrays
        {
            for (int i = 0; i < this.matrix.length; i++)
            {
                for (int j = 0; j < this.matrix[i].length; j++)
                {
                    this.matrix[i][j] += m2.matrix[i][j];
                }
            }
            this.print();
        }
        else
        {
            System.out.println("Matrix dimensions do not match.");
        }
    }

    /**
     * Method to initialize values for the matrix.
     *
     * Not required for the assignment, but will be used to test the program.
     */
    public void init_matrix()
    {
        for (int i = 0; i < this.matrix.length; i++)
        {
            for (int j = 0; j < this.matrix[i].length; j++)
            {
                System.out.println("Enter value for (" + i + ", " + j + "): ");
                this.matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
