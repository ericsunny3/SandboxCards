
class Deck
{
	//constants for each type of card
	static final private US = 1;
	static final private ITALIAN = 2;
	
	//holds current cards present in the deck
	ArrayList<Card> cardCount = new Arraylist<>();
	
	//create an empty deck object
	Deck()
	{
		
	}
	
	//create a full deck indicating the type
	Deck(int type)
	{
		//for any standard 52 card deck
		for(i = 0; i < 52; i++)
		{
			cardCount.add(new Card(type));
		}
		/*for any other types of decks that may exist. Please edit!
	        for(i = 0; i < ??; i++)
		{
			cardCount.add(new Card(type));
		}
		*/
	}
	
	//Remove and return top card of deck
	public Card pop()
	{
		Card tempCard = cardCount.get(cardCount.Size() - 1);
		cardCount.remove(cardCount.Size() - 1);

		return tempCard;
	}
}
