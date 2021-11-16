package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalDeckTest {

    @Test
    public void getDeckInOrder_return52CardsCorrectlyFormatted() {
        AnimalDeck animalDeck = new AnimalDeck();
        assertThat(animalDeck.getAllCards()).containsExactly("AARDVARK", "AARDVARK", "BABOON", "BABOON", "CAMEL",
                "CAMEL", "DEER", "DEER", "ELEPHANT", "ELEPHANT", "FROG", "FROG", "GORILLA", "GORILLA", "HARE", "HARE",
                "IMPALA", "IMPALA", "JAGUAR", "JAGUAR", "KANGAROO", "KANGAROO", "LION", "LION", "MOOSE", "MOOSE",
                "NEWT", "NEWT", "OCTOPUS", "OCTOPUS", "PENGUIN", "PENGUIN", "QUETZAL", "QUETZAL", "RABBIT", "RABBIT",
                "SALMON", "SALMON", "TORTOISE", "TORTOISE", "UAKARIS", "UAKARIS", "VAQUITA", "VAQUITA", "WHALE",
                "WHALE", "X_RAY_TETRA", "X_RAY_TETRA", "YAK", "YAK", "ZEBRA", "ZEBRA");
    }

    @Test
    public void shuffle_returnsAllCardsInAnyOrder() {
        AnimalDeck deck = new AnimalDeck();
        deck.shuffle();
        assertThat(deck.getAllCards()).containsExactlyInAnyOrder("AARDVARK", "AARDVARK", "BABOON", "BABOON", "CAMEL",
                "CAMEL", "DEER", "DEER", "ELEPHANT", "ELEPHANT", "FROG", "FROG", "GORILLA", "GORILLA", "HARE", "HARE",
                "IMPALA", "IMPALA", "JAGUAR", "JAGUAR", "KANGAROO", "KANGAROO", "LION", "LION", "MOOSE", "MOOSE",
                "NEWT", "NEWT", "OCTOPUS", "OCTOPUS", "PENGUIN", "PENGUIN", "QUETZAL", "QUETZAL", "RABBIT", "RABBIT",
                "SALMON", "SALMON", "TORTOISE", "TORTOISE", "UAKARIS", "UAKARIS", "VAQUITA", "VAQUITA", "WHALE",
                "WHALE", "X_RAY_TETRA", "X_RAY_TETRA", "YAK", "YAK", "ZEBRA", "ZEBRA");
    }
}