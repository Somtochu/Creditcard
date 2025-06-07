package Decks;
//import java.util.*;

public class deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    //public static int numCards = numSuits * numRanks;

    private final Card[][] cards;

    public deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {

        return cards[suit-1][rank-1];
    }
}