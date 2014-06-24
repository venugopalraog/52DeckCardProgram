package com.android.vjitglobal;

import java.util.*;

import android.util.Log;

public class DeckOfCards {
	List<Card> mCards;

	private static final String TAG = "DeckOfCards";

	public DeckOfCards() { 
		mCards = new ArrayList<Card>();
		//Prepare the Deck Of cards
		for (Card.Suits suite : Card.Suits.values()) {
			for (Card.Ranks rank : Card.Ranks.values()) {
				mCards.add(new Card(suite, rank));
			 }
		}
	}

	public void shuffleCards() {
		//Shuffle the deck of cards
		Collections.shuffle(mCards);
	}
	
	//Function to shuffle the cards initialized and returns random card
	public String deal() {
		Card dealCard;
		//Shuffle the cards
		shuffleCards();
		dealCard = mCards.get(0);

		return (dealCard.suiteToString() + " " + dealCard.rankToString());
	}

	//Function to display the cards
	public void displayCards() {
		int i = 1;
		for (Card str : mCards) {
            Log.d(TAG, "displayCards -- Card suite: " + str.suiteToString() + "  Ranks: " + str.rankToString() + " ---- " + i);
            i++;
        }
	}
}
