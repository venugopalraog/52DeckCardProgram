package deckofcards;

import java.util.*;

public class TestDeckOfCards{

    public static void main(String args[]) {
		DeckOfCards cards = new DeckOfCards();

		cards.displayCards();
		cards.shuffleCards();
		cards.displayCards();
		System.out.println("main method called");
	}
}
