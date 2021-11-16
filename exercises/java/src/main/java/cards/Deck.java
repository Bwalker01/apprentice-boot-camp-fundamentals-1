package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
    List<Card> cardsInDeck;

    Deck() {
        cardsInDeck = new ArrayList<>();
    }

    public void shuffle() {
        Collections.shuffle(cardsInDeck);
    }

    public String[] getCards() {
        String[] result = new String[cardsInDeck.size()];
        for (int i = 0; i < cardsInDeck.size(); i++) {
            Card card = cardsInDeck.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public Card deal() {
        return cardsInDeck.remove(0);
    }
}
