/******************************************************************************
 *  Compilation:  javac Quadratic.java.java
 *  Execution:    java Quadatic b c
 *
 *  Given b and c, solves for the roots of x*x + b*x + c.
 *  Assumes both roots are real valued.
 *
 *  % java Quadratic.java -3.0 2.0
 *  2.0
 *  1.0
 *
 *  % java Quadratic.java -1.0 -1.0
 *  1.618033988749895
 *  -0.6180339887498949
 *
 *  Remark:  1.6180339... is the golden ratio.
 *
 *  % java Quadratic.java 1.0 1.0
 *  NaN
 *  NaN
 *
 *
 ******************************************************************************/


public class Quadratic {

    public static void main(String[] args) {
        double b, c, discriminant, sqroot, root1, root2;

        // Convert string arguments to double data type
        b = Double.parseDouble(args[0]);
        c = Double.parseDouble(args[1]);

        // Preliminary calcs to the quadratic formula
        discriminant = b * b - 4.0 * c;
        sqroot = Math.sqrt(discriminant);


        // set up the numerators
        root1 = (-b + sqroot) / 2;
        root2 = (-b - sqroot) / 2;

        System.out.println(root1);
        System.out.println(root2);

    }
}
