package cards;

import java.util.List;

public class MixedDeck extends Deck {
    MixedDeck() {
        AnimalDeck aniDeck = new AnimalDeck();
        List<Card> animalDeck = aniDeck.getDeck();
        PlayingCardDeck pcDeck = new PlayingCardDeck();
        List<Card> playingCardDeck = pcDeck.getDeck();
        cardsInDeck.addAll(animalDeck);
        cardsInDeck.addAll(playingCardDeck);
    }
}
