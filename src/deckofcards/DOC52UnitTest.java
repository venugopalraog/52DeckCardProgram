package deckofcards;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author venugopalraog
 *
 */
public class DOC52UnitTest {
	DeckOfCards52Impl mDeckOfCards = null;

	@Before
	public void setUp() throws Exception {
		mDeckOfCards = new DeckOfCards52Impl();
		assertNotNull(mDeckOfCards);
		mDeckOfCards.initializeCards();
	}

	@After
	public void tearDown() throws Exception {
		mDeckOfCards = null;
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#shuffleCards()}.
	 */
	@Test
	public void initializeCards() { 
		int size = mDeckOfCards.getSize();
		assertFalse(size != 52);
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#shuffleCards()}.
	 */
	@Test
	public void testShuffleCards() {
		assertNotNull(mDeckOfCards);
		String card1 = mDeckOfCards.getItem(0);
		mDeckOfCards.shuffleCards();
		String card2 = mDeckOfCards.getItem(0);
		assertFalse(card1.equals(card2));
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#deal()}.
	 */
	@Test
	public void testDeal() {
		assertNotNull(mDeckOfCards);
		String deal1 = mDeckOfCards.deal();
		String deal2 = mDeckOfCards.deal();
		assertFalse(deal1.equals(deal2));
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#displayCards()}.
	 */
	@Test
	public void testDisplayCards() {
		assertNotNull(mDeckOfCards);
		mDeckOfCards.displayCards();
	}

	/**
	 * Test method for {@link deckofcards.DeckOfCards#getItem()}.
	 */
	@Test
	public void testGetItem() {
		String card = null;
		assertNotNull(mDeckOfCards);
		for (int index = 0; index <52; index++) {
			card = mDeckOfCards.getItem(index);
			assertNotNull(card);	
		}
	}
}