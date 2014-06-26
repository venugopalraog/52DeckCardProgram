package deckofcards;

import java.util.*;

public class DeckOfCards52 implements IDeckOfCards{
	List<Card> mCards;
	private static final int FIRST_CARD = 0;
	/********************************************************************************
	 * Function Name : initializeCards
	 * Description : This function initializes the deck of cards.
	 ********************************************************************************/
	public void initializeCards() {
		try {
			mCards = new ArrayList<Card>();
			//Prepare the Deck Of cards
			for (Card.Suits suite : Card.Suits.values()) {
				for (Card.Ranks rank : Card.Ranks.values()) {
					mCards.add(new Card(suite, rank));
				}
			}
		} catch(OutOfMemoryError e){
			System.out.print("OutOfMemory Exception: Not able to allocate memory" + e);
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
		dealCard = mCards.get(FIRST_CARD);

		return (dealCard.suiteToString() + " " + dealCard.rankToString());
	}

	/********************************************************************************
	 * Function Name : displayCards
	 * Description : This function displays all the deck of cards.
	 ********************************************************************************/
	public void displayCards() {
		int index = 1;
		try {
			for (Card str : mCards) {
				System.out.println("displayCards -- " + str.suiteToString() + " " + str.rankToString() + " ---- " + index);
				index++;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception" + e);
		}
	}

	/********************************************************************************
	 * Function Name : getItem
	 * Description : This function gets item from the deck of cards.
	 ********************************************************************************/
	public String getItem(int pos) {
		String strCard = null;
		try {
			Card card = mCards.get(pos);
			strCard = (card.suiteToString() + " " + card.rankToString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception" + e);
		}
		return strCard;
	}
}