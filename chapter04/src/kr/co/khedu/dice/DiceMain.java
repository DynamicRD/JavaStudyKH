package kr.co.khedu.dice;

public class DiceMain {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int count = 0;
		
		
		for(; !(dice1.getValue() == 1 && dice2.getValue() == 1);count++)
		{
			dice1.roll();
			dice2.roll();
			System.out.println("주사위1 = "+dice1.getValue()+" 주사위2 = "+dice2.getValue());			
		}
		System.out.println("(1,1)이 나오는데 걸린 횟수="+count);
	}

}
