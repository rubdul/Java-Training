/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *
 *  Prints out n in binary.
 *
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 *
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 ******************************************************************************/


public class Binary {
    public static void main(String[] args) {

        // Read the argument from the function
        int n = Integer.parseInt(args[0]);

        // check for the largest power of 2 available
        int power = 1;
        while (power <= (n / 2)) {
            power *= 2;
            System.out.println("highest power is " + power); // Lets start off at 2
        }
        // Start incrementing down the powers of 2 to find out if they are included
        while (power > 0) {
            if (n < power) {
                System.out.print("0");// 0 not reduceable by 2
            } else {

                System.out.print("1");// print a 1 for the binary representation of true
                n -= power;// reduce the initial number by reducing it by

            }

            // reduce the power of 2 by halving it.
            power /= 2;

        }
        System.out.println();
    }

}
