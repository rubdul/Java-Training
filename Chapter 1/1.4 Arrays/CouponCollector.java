/******************************************************************************
 *  Compilation:  javac CouponCollector.java
 *  Execution:    java CouponCollector n
 *
 *  Given n distinct card types, how many random cards do you need
 *  do collect before you have (at least) one of each type?
 *  This program simulates this random process.
 *
 *
 *  % java CouponCollector 1000
 *  6583
 *
 *  % java CouponCollector 1000
 *  6477
 *
 *  % java CouponCollector 1000000
 *  12782673
 *
 ******************************************************************************/

public class CouponCollector {

    public static void main(String[] args) {
        // Take the amount of card types from the random int
        int n = Integer.parseInt(args[0]);

        // Boolean array to represent if the card type has been collected
        boolean[] isCollected = new boolean[n];

        // Count of how many times the while loop is used to get a card
        int count = 0;
        // Count how many times a distinct card is picked
        int distinct = 0;

        // While loop to keep looking through the cards at random
        while (distinct < n) {
            // Pick a random value in the deck, "so to speak"
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;

            }

        }

        System.out.println(count + " attempts.");
    }

}
