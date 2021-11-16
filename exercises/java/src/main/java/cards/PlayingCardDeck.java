package cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements SnapDeckInterface {
    private PlayingCard[] deck;
    private int nextCard;

    public PlayingCardDeck() {
        this.deck = new PlayingCard[52];
        this.nextCard = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit * 13 + faceValue] = new PlayingCard(suit, faceValue);
            }
        }
    }

    public String[] getDeck() {
        String[] result = new String[52];
        for (PlayingCard card : deck) {
            result[card.getSuitNum() * 13 + card.getValue()] = card.toString();
        }

        return result;
    }

    public void shuffle() {
        nextCard = 0;
        List<PlayingCard> deckList = Arrays.asList(deck);
        Collections.shuffle(deckList);
        deck = deckList.toArray(deck);
    }

    public PlayingCard deal() {
        PlayingCard card = deck[nextCard];
        nextCard++;
        return card;
    }

    public PlayingCard[] getCards() {
        return deck;
    }
}
