package cards;

import java.util.List;

public class MixedDeck extends Deck {
    MixedDeck() {
        super();
        // for (Animal animal : Animal.values()) {
        // cardsInDeck.add(new AnimalCard(animal));
        // cardsInDeck.add(new AnimalCard(animal));
        // }
        // for (int suit = 0; suit < 4; suit++) {
        // for (int faceValue = 0; faceValue < 13; faceValue++) {
        // cardsInDeck.add(new PlayingCard(suit, faceValue));
        // }
        // }
        AnimalDeck aniDeck = new AnimalDeck();
        List<Card> animalDeck = aniDeck.getDeck();
        PlayingCardDeck pcDeck = new PlayingCardDeck();
        List<Card> playingCardDeck = pcDeck.getDeck();
        cardsInDeck.addAll(animalDeck);
        cardsInDeck.addAll(playingCardDeck);
    }
}
