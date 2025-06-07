package Decks;

public class displayDeck {
    public static void main(String[] args) {
        deck deck = new deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    Card.rankToString(card.getRank()),
                    Card.suitToString(card.getSuit()));
            }
        }
    }
}