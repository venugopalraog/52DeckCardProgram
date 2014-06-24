package deckofcards;

public class TestDeckOfCards{

    public static void main(String args[]) {
		DeckOfCards cards = new DeckOfCards();

		//Display the initialized 52 Deck of card list
		cards.displayCards();

		//Shuffle the 52 Deck of card list
		cards.shuffleCards();

		//Display the shuffled 52 Deck of card list
		cards.displayCards();

		//shuffle and get the deal one card
		System.out.println("***** deal --- " + cards.deal());
	}
}
