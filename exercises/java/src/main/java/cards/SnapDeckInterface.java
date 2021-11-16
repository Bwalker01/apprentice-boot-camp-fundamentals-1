package cards;

public interface SnapDeckInterface {
    SnapCardInterface deal();

    void shuffle();

    SnapCardInterface[] getCards();
}
