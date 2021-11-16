package cards;

public class AnimalCard extends Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap(Card compare) {
        if (compare instanceof AnimalCard) {
            AnimalCard card = (AnimalCard) compare;
            return card != null && this.animal.equals(card.animal);
        }
        return false;
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
