package cards;

class AnimalDeck extends Deck {
    AnimalDeck() {
        super();
        for (Animal animal : Animal.values()) {
            cardsInDeck.add(new AnimalCard(animal));
            cardsInDeck.add(new AnimalCard(animal));
        }
    }
}
