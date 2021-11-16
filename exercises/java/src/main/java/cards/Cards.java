package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }

    String[] getCards() {
        PlayingCardDeck deck = new PlayingCardDeck();
        return deck.getCards();
    }
}
