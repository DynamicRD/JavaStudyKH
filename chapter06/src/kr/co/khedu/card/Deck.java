package kr.co.khedu.card;

import java.util.ArrayList;

public class Deck extends Card {
	private ArrayList<String> cardDeck;

	public ArrayList<String>  getCardDeck() {
		return cardDeck;
	}

	public Deck() {
		super();
		cardDeck = new ArrayList<String>();
		/*
		 * for(int i=0;i<getType().size();i++) { for(int j=0;j<getNumber().length;j++) {
		 * cardDeck[13*i+j] = getType()[i] +" "+getNumber()[j];
		 * System.out.print(cardDeck[13*i+j]+", "); } }
		 */
	}

	public void setCardDeck(String[] cardDeck) {
	//	this.cardDeck = cardDeck;
	}
	
	
	
}
