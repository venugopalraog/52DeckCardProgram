package deckofcards;

import java.util.*;

public class DeckOfCards {
	List<Card> mCards;

	//DeckOfCards constructor which initializes the 52 deck of cards
	public DeckOfCards() {
		mCards = new ArrayList<Card>();
		//Prepare the Deck Of cards
		for (Card.Suits suite : Card.Suits.values()) {
			for (Card.Ranks rank : Card.Ranks.values()) {
				mCards.add(new Card(suite, rank));
			}
		}
	}

	/********************************************************************************
	 * Function Name : shuffleCards
	 * Description : This function shuffles the deck of cards.
	 ********************************************************************************/
	public void shuffleCards() {
		//Shuffle the deck of cards
		Collections.shuffle(mCards);
	}

	/********************************************************************************
	 * Function Name : deal
	 * Description : This function shuffles the deck of cards and returns the first
	 *               element of the shuffled list.
	 ********************************************************************************/
	public String deal() {
		Card dealCard;
		shuffleCards();
		dealCard = mCards.get(0);

		return (dealCard.suiteToString() + " " + dealCard.rankToString());
	}

	/********************************************************************************
	 * Function Name : displayCards
	 * Description : This function displays all the deck of cards.
	 ********************************************************************************/
	//Function to display the cards
	public void displayCards() {
		int index = 1;
		for (Card str : mCards) {
			System.out.println("displayCards -- " + str.suiteToString() + " " + str.rankToString() +
								" -- " + index);
			index++;
		}
	}
}