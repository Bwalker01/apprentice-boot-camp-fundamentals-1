package cards;

public class PlayingCardDeck {
    private PlayingCard[] deck;

    public PlayingCardDeck() {
        PlayingCard[] deck = new PlayingCard[52];

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
}
