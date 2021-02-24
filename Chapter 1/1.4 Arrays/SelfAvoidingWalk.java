/******************************************************************************
 *  Compilation:  javac SelfAvoidingWalk.java
 *  Execution:    java SelfAvoidingWalk n trials
 *
 *  Generate trials self-avoiding walks in an n-by-n grid. For each walk,
 *  continue until either it reaches the boundary (coordinate 0 or n-1)
 *  or reaches a dead end (all neighboring sites have been visited).
 *  Prints the fraction of random walks that lead to dead ends.
 *
 ******************************************************************************/

public class SelfAvoidingWalk {

    public static void main(String[] args) {

        // Declare the grid space, how many trials wee want to run and dead end
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;

        for (int t = 0; t < trials; t++) {
            // create the grid structure
            boolean[][] a = new boolean[n][n];
            // The character's x and y values set themself up in the middle of the city
            int x = n / 2;
            int y = n / 2;


            // while loop to check if we have reached a dead end or have escaped
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {// This checks if x and y are in the array's bounds.

                // dead end check, see if all sides are true
                if (a[x][y - 1] && a[x][y + 1] && a[x - 1][y] && a[x + 1][y]) {
                    deadEnds++;
                    break;
                }

                // Mark the current position as visited
                a[x][y] = true;


                // create a random variable to simulate a direction
                double r = Math.random();

                // Have conditionals to check which direction you are moving in to make true
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } else if (r < 0.5) {
                    if (!a[x - 1][y]) x--;
                } else if (r < .75) {
                    if (!a[x][y + 1]) y++;
                } else if (r < 1.00) {
                    if (!a[x][y - 1]) y--;

                }

            }

        }
        System.out.println("The player escaped after " + deadEnds + " dead ends.");
    }

}
