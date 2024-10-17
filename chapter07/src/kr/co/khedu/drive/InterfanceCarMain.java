package kr.co.khedu.drive;

import java.util.ArrayList;

public class InterfanceCarMain {

	public static void main(String[] args) {
		ArrayList<InterfaceCar> list = new ArrayList<InterfaceCar>();
		list.add(new AutoCar(100,200));
		list.add(new AiCar(200,500));
		
		for(int i =0;i<list.size();i++)
		{
			list.get(i).start();
			list.get(i).stop();
			list.get(i).setSpeed(100);
			list.get(i).turn(80);
		}
	}

}
