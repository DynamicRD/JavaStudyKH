package kr.co.khedu.card2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardMain {

	public static void main(String[] args) {
		//52개 카드를 만들었습니다.
		Deck deck = new Deck();
		
		System.out.println();
		System.out.println();
		
		List<String> list = Arrays.asList(deck.getCardDeck());
		Collections.shuffle(list);
		
		//5장을 뽑는다.
		for(int i = 0;i<5;i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
