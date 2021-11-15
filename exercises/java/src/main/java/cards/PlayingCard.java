package cards;

public class PlayingCard {
    private Suit suit;
    private int suitNum;
    private int faceValue;

    public PlayingCard(int suit, int faceValue) {
        this.suit = new Suit(suit);
        this.suitNum = suit;
        this.faceValue = faceValue;
    }

    public int getValue() {
        return faceValue;
    }

    public int getSuitNum() {
        return suitNum;
    }

    public String toString() {
        String faceValueName;

        switch (faceValue) {
        case 0:
            faceValueName = "ace";
            break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            faceValueName = Integer.toString(faceValue + 1);
            break;
        case 10:
            faceValueName = "jack";
            break;
        case 11:
            faceValueName = "queen";
            break;
        case 12:
            faceValueName = "king";
            break;
        default:
            throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
        }

        String suitName = suit.toString();

        return String.format("%s of %s", faceValueName, suitName);
    }
}
