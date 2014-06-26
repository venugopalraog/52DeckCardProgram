package deckofcards;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author venugopalraog
 *
 */
public class DOC52UnitTest {
	/**
	 * Test method for {@link deckofcards.DeckOfCards#DeckOfCards()}.
	 */
	@Test
	public void testInitializeCards() {
		DeckOfCards52 mDeckOfCards = new DeckOfCards52();
		mDeckOfCards.initializeCards();
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#shuffleCards()}.
	 */
	@Test
	public void testShuffleCards() {
		DeckOfCards52 mDeckOfCards = new DeckOfCards52();
		mDeckOfCards.initializeCards();
		mDeckOfCards.shuffleCards();
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#deal()}.
	 */
	@Test
	public void testDeal() {
		DeckOfCards52 mDeckOfCards = new DeckOfCards52();
		assertNotNull(mDeckOfCards);
		mDeckOfCards.initializeCards();
		String deal1 = mDeckOfCards.deal();
		String deal2 = mDeckOfCards.deal();
		assertFalse(deal1.equals(deal2));
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#displayCards()}.
	 */
	@Test
	public void testDisplayCards() {
		DeckOfCards52 mDeckOfCards = new DeckOfCards52();
		assertNotNull(mDeckOfCards);
		mDeckOfCards.initializeCards();
		mDeckOfCards.displayCards();
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#getItem()}.
	 */
	@Test
	public void testGetItem() {
		DeckOfCards52 mDeckOfCards = new DeckOfCards52();
		String card = null;
		assertNotNull(mDeckOfCards);
		mDeckOfCards.initializeCards();
		for (int index = 0; index <52; index++) {
			card = mDeckOfCards.getItem(index);
			assertNotNull(card);	
		}
	}
}