package kr.co.khedu.card;

import java.util.Arrays;

public class Card {
		private String[] type;
		private String[] number;

		public Card() {
			super();
			type = new String[] {"♣","◆","♥","♠"};
			number = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			}

		public String[] getType() {
			return type;
		}

		public void setType(String[] type) {
			this.type = type;
		}

		public String[] getNumber() {
			return number;
		}

		public void setNumber(String[] number) {
			this.number = number;
		}

		@Override
		public String toString() {
			return "Card [type=" + Arrays.toString(type) + ", number=" + Arrays.toString(number) + "]";
		}		
		
		
}
