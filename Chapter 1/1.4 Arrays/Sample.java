/******************************************************************************
 *  Compilation:  javac Sample.java
 *  Execution:    java Sample m n
 *
 *  This program takes two command-line arguments m and n and produces
 *  a random sample of m of the integers from 0 to n-1.
 *
 *  % java Sample 6 49
 *  10 20 0 46 40 6
 *
 *  % java Sample 10 1000
 *  656 488 298 534 811 97 813 156 424 109
 *
 ******************************************************************************/

public class Sample {

    public static void main(String[] args) {
        // Initialize the argument inputs
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        // Create the permutation array
        int[] perm = new int[N];

        // Fill the permutation array with values from 1 to N-1
        for (int j = 0; j < N; j++) {
            perm[j] = j;
        }

        // Create a sample through replacement of values greater than the index i
        for (int i = 0; i < M; i++) {

            // Create a random index to the right of index i
            int r = (i + (int) (Math.random() * (N - i)));

            int replace = perm[i];
            perm[i] = perm[r];
            perm[r] = replace;
        }


        // Print a sample of the array perm thorugh a for loop

        for (int c = 0; c < N; c++)
            System.out.print(perm[c] + " ");

        System.out.println();


    }
}
