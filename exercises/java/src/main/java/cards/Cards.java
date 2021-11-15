package cards;

public class Cards {
    public static void main(String[] args) {
        PlayingCardDeck deck = new PlayingCardDeck();
        String[] deckInOrder = deck.getDeck();
        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit * 13 + faceValue] = new PlayingCard(suit, faceValue);
            }
        }

        for (PlayingCard card : deck) {
            result[card.getSuitNum() * 13 + card.getValue()] = card.toString();
        }

        return result;
    }
}
