package homework_24_09_26;

import java.util.ArrayList;

public class MovableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movable> list = new ArrayList<Movable>();
		
		for(int i = 0;i<10;i++)
		{
			list.add(new Triagle(10,10));
			list.get(i).move((int)(Math.random()*100)+1, (int)(Math.random()*100)+1);
		}
	}

}
