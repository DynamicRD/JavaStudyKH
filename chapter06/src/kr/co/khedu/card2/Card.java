package kr.co.khedu.card2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
		//private String[] type;
		//private String[] number;
		List<String> type;
		List<String> number;
	
	
		public Card() {
			super();
			type = Arrays.asList("♣","◆","♥","♠");
			number = Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K");
			}


		public List<String> getType() {
			return type;
		}


		public void setType(ArrayList<String> type) {
			this.type = type;
		}


		public List<String> getNumber() {
			return number;
		}


		public void setNumber(ArrayList<String> number) {
			this.number = number;
		}


		@Override
		public String toString() {
			return "Card [type=" + type + ", number=" + number + "]";
		}

	
		
}
