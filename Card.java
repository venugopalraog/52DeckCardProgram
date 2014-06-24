package com.android.vjitglobal;

public class Card {

	public enum Suits { SPADES, HEARTS, DIAMONDS, CLUBS };

	public enum Ranks { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
					    EIGHT, NINE, TEN, JACK, QUEEN, KING };

	public Suits mCardSuite;
	public Ranks mCardNumber;

	Card(Suits suits, Ranks rank) {
		mCardSuite = suits;
		mCardNumber = rank;
	}
	
	public String suiteToString() {
		String str;

		switch(mCardSuite) {
			case SPADES:
				str = "SPADES ";
				break;
			case HEARTS:
				str = "HEARTS ";
				break;
			case DIAMONDS:
				str = "DIAMONDS ";
				break;
			case CLUBS:
				str = "CLUBS ";
				break;
			default :
				str = "JOKER ";
		}
		
		return str;
	}
	
	public String rankToString() {
		String str;
		
		switch(mCardNumber) {
			case ACE:
				str = "A";
				break;
			case TWO:
				str = "2";
				break;
			case THREE:
				str = "3";
				break;
			case FOUR:
				str = "4";
				break;
			case FIVE:
				str = "5";
				break;
			case SIX:
				str = "6";
				break;
			case SEVEN:
				str = "7";
				break;
			case EIGHT:
				str = "8";
				break;
			case NINE:
				str = "9";
				break;
			case TEN:
				str = "10";
				break;
			case JACK:
				str = "J";
				break;
			case QUEEN:
				str = "Q";
				break;
			case KING:
				str = "K";
				break;
			default:
				str = " ";
		}
		return str;
	}
}
