/***************************************************
 Make a program to have someone cast a line into the sea and then try to get a fish

 The Joke is Cast a line, get a fish, but 2 + 2 = fish
 ***************************************************/


public class CastAFish {

    public static void main(String[] args) {
        // Cast a number and make it a double
        double cast = Double.parseDouble(args[0]);

        // The cast only goes half way
        int line = cast / 2;

        // Make a new double
        int fish = Math.random() * 5;

        // Make the fish travel to some random place
        double bait = Math.random() * fish;

        // find the approximate distance between the fish
        int dist = Math.round(bait - cast);


        // Printing preliminaries
        System.out.println(" You cast a line to " + cast + " but alas the fish is on!");
        System.out.println("Wait a minute the fish is travelling to the bait at" + bait + ".");

        if (dist == 0) {
            System.out.print('It looks like you were on the money you got a fish!')
        } else if (dist >= 1 && dist <= 2) {
            System.out.println('Ooooh. So close.');
            System.out.println('But, 2 plus 2 equals fish.');
        } else {
            System.out.println("The super intelligent dolphins would like a word with you.");
            System.out.println('So long and thanks for all the fish.');
        }

    }
