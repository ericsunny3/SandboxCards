
class Deck
{
	final private STANDARD = 1;
	final private ITALIAN = 2;
	
	//holds current cards present in the deck
	ArrayList<Card> cardCount = new Arraylist<>();
	
	//create an empty deck object
	Deck()
	{
		
	}
	
	//create a full deck indicating if it has jokers and what type of deck it is
	Deck(int type, boolean jokers)
	{
		int defaultSize = 52;
		
		if(jokers == true)
			defaultSize += 2;
		
		switch(type)
		{
			case STANDARD: 
				for(i = 0; i < defaultSize; i++)
				{
					cardCount.add(new Card(STANDARD));
				}
			case ITALIAN:
				for(i = 0; i < defaultSize; i++)
				{
					cardCount.add(new Card(ITALIAN));
				}
		}
	}
	
	//Remove and return top card of deck
	public pop()
	{
		cardCount.
		
		
		return card
	}
	
	}


}
