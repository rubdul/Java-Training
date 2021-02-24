/******************************************************************************
 *  Compilation:  javac IntOps.java
 *  Execution:    java IntOps a b
 *
 *  Illustrates the integer operations a + b, a * b, a / b, and a % b.
 *
 *  % java IntOps 1234 99
 *  1234 + 99 = 1333
 *  1234 * 99 = 122166
 *  1234 / 99 = 12
 *  1234 % 99 = 46
 *  1234 = 12 * 99 + 46
 *
 *  % java IntOps 10 -3
 *  10 + -3 = 7
 *  10 * -3 = -30
 *  10 / -3 = -3
 *  10 % -3 = 1
 *  10 = -3 * -3 + 1
 *
 ******************************************************************************/


public class IntOps {
    public static void main(String[] args) {

        // Initiate and declare integers
        int a, b, sum, prod, quot, rem;

        // Convert arguments from string values for integers a and b
        a = Integer.parseInt(args[0]); // argument 1
        b = Integer.parseInt(args[1]); // argument 2

        // Assign values to the other products
        sum = a + b;
        prod = a * b;
        quot = a / b;
        rem = a % b;

        // Print the outputs to the command line
        System.out.println(a + "+" + b + "=" + sum);
        System.out.println(a + "*" + b + "=" + prod);
        System.out.println(a + "/" + b + "=" + quot);
        System.out.println(a + "=" + quot + "*" + b + '+' + rem);


    }


}

