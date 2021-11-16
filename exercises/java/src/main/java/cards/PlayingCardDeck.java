package cards;

public class PlayingCardDeck extends Deck {
    public PlayingCardDeck() {
        super();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cardsInDeck.add(new PlayingCard(suit, faceValue));
            }
        }
    }
}
