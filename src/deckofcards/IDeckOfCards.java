package deckofcards;

public interface IDeckOfCards {

	/********************************************************************************
	 * Function Name : initializeCards
	 * Description : This function initializes the deck of cards.
	 ********************************************************************************/
	public void initializeCards();

	/********************************************************************************
	 * Function Name : shuffleCards
	 * Description : This function shuffles the deck of cards.
	 ********************************************************************************/
	public void shuffleCards();

	/********************************************************************************
	 * Function Name : deal
	 * Description : This function shuffles the deck of cards and returns the first 
	 *               element of the shuffled list.
	 ********************************************************************************/
	public String deal();

	/********************************************************************************
	 * Function Name : displayCards
	 * Description : This function displays all the deck of cards.
	 ********************************************************************************/
	public void displayCards();
	
	/********************************************************************************
	 * Function Name : getItem
	 * Description : This function gets item from the deck of cards.
	 ********************************************************************************/
	public String getItem(int pos);
}