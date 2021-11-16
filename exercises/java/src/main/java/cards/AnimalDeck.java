package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements SnapDeckInterface {

    private List<AnimalCard> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public SnapCardInterface[] getCards() {
        SnapCardInterface[] array = new SnapCardInterface[cards.size()];
        return cards.toArray(array);
    }

    public String[] getAllCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            AnimalCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public SnapCardInterface deal() {
        return cards.remove(0);
    }
}
