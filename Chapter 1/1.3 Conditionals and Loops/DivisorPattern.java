/******************************************************************************
 *  Compilation:  javac DivisorPattern.java
 *  Execution:    java DivisorPattern n
 *
 *  Prints a table where entry (i, j) is a '* ' if i divides j
 *  or j divides i and '. ' otherwise.
 *
 *
 *  % java DivisorPattern 20
 *  * * * * * * * * * * * * * * * * * * * * 1
 *  * *   *   *   *   *   *   *   *   *   * 2
 *  *   *     *     *     *     *     *     3
 *  * *   *       *       *       *       * 4
 *  *       *         *         *         * 5
 *  * * *     *           *           *     6
 *  *           *             *             7
 *  * *   *       *               *         8
 *  *   *           *                 *     9
 *  * *     *         *                   * 10
 *  *                   *                   11
 *  * * * *   *           *                 12
 *  *                       *               13
 *  * *         *             *             14
 *  *   *   *                   *           15
 *  * *   *       *               *         16
 *  *                               *       17
 *  * * *     *     *                 *     18
 *  *                                   *   19
 *  * *   * *         *                   * 20
 *
 ******************************************************************************/


public class DivisorPattern {

    public static void main(String[] args) {

        // User Given argument
        int N = Integer.parseInt(args[0]);


        // Set up the outer for loop of i
        for (int i = 1; i <= N; i++) {

            // The inner for loop to initialize j and run divisor pattern
            for (int j = 1; j <= N; j++) {

                // Check if i is perfectly divisible by i is 0 or if j is perfectly divisible by i
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("* ");

                }
                //
                else {
                    System.out.print("  ");

                }


            }

            // print out i at the end of the loop
            System.out.println(i);

        }


    }

}
