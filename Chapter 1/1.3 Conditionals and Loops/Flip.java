/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *
 *  Simulate a fair coin flip and print out "Heads" or "Tails" accordingly.
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Tails
 *
 *
 ******************************************************************************/


public class Flip {

    public static void main(String[] args) {
        // Get a "Random value from the computer"
        double flip = Math.random();
        if (flip > 0.5) System.out.println("Heads");
        else System.out.println("Tails");
    }
}
