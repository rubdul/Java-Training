/*Makes a deck of cards style array */


public class Deck {
    public static void main(String[] args) {

        // Create the card suits
        String[] suit = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        // Create the card values/ranks
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // create the deck of cards
        String[] deck = new String[suit.length * rank.length];

        for (int j = 0; j < rank.length; j++) {
            for (int i = 0; i < suit.length; i++) {

                deck[rank.length * i + j] = rank[j] + " of " + suit[i];
                System.out.println(deck[rank.length * i + j]);
            }
        }

    }

}
