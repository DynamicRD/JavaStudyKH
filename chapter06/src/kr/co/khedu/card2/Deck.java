package kr.co.khedu.card2;

public class Deck extends Card {
	private String[] cardDeck;

	public String[] getCardDeck() {
		return cardDeck;
	}

	public Deck() {
		super();
		cardDeck = new String[52];
		for(int i=0;i<getType().size();i++)
		{
			for(int j=0;j<getNumber().size();j++)
			{
			
				System.out.print(cardDeck[13*i+j]+", ");
			}
		}
	}

	public void setCardDeck(String[] cardDeck) {
		this.cardDeck = cardDeck;
	}
	
	
	
}
