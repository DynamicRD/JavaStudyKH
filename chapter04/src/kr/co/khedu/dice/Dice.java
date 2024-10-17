package kr.co.khedu.dice;

public class Dice {
	private int face;
	
	public Dice(){}
	
	public void roll()
	{
		face = (int)(Math.random()*6)+1;		
	}
	
	public int getValue()
	{
		return face;
	}
}
