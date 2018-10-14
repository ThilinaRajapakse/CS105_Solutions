package pdn.scs.lab6_arrays.individual_assignment;

import pdn.scs.lab6_arrays.individual_assignment.matrix.Matrix;

public class Main
{
    public static void main(String[] args)
    {
        Matrix m1 = new Matrix(2, 3);
        m1.init_matrix();
        m1.print();
        System.out.println("-----------------------------------------------");

        Matrix m2 = new Matrix(2, 3);
        m2.init_matrix();
        m2.print();
        System.out.println("-----------------------------------------------");

        Matrix m3 = new Matrix(1, 2);
        m3.init_matrix();
        m3.print();
        System.out.println("-----------------------------------------------");

        System.out.println("m1 + m2: ");
        m1.add_matrix(m2);
        System.out.println("-----------------------------------------------");

        System.out.println("m1 + m3: ");
        m1.add_matrix(m3);
        System.out.println("-----------------------------------------------");
    }
}
