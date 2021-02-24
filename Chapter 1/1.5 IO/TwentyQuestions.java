/******************************************************************************
 *  Compilation:  javac TwentyQuestions.java
 *  Execution:    java TwentyQuestions
 *  Dependencies  StdIn.java
 *
 *  % java TwentyQuestions
 *  I'm thinking of a number between 1 and 1,000,000
 *  What's your guess? 500000
 *  Too high
 *  What's your guess? 250000
 *  Too low
 *  What's your guess? 375000
 *  Too high
 *  What's your guess? 312500
 *  Too high
 *  What's your guess? 300500
 *  Too low
 *  ...
 *
 ******************************************************************************/

//import stdlib.jar.StdOut;


// Big error I need to get java using the standard library!!!

public class TwentyQuestions {

    public static void main(String[] args) {
        // Make a random number to guess between 0 and 100
        int secret = (int) (Math.random() * 100);
        StdOut.print("I'm thinking of a number.");
        StdOut.println("Between 1 and 100");

        // Guess initialization
        int guess = 0;
        int attempts = 0; // The counter for Attempts

        while (guess != secret && attempts <= 10) {
            // Have the user make a guess
            guess = StdIn.readInt();
            // Increment the amount of attempts. If it goes higher than the limit  break out of the loop
            attempts++;

            // I guess if
            if (guess > secret) StdOut.println("Too High, guess a little lower.");
            else if (guess < secret) StdOut.println("Too Low, go higher and reach for the sky.");
            else if (guess == secret) break;


        }
        if (guess == secret) StdOut.println("Congratulations you guessed my number, %d", secret);
        else if (guess != secret && attempts > 10)
            StdOut.println("Sorry you're all out of tries my number was %d", secret);

    }

}
