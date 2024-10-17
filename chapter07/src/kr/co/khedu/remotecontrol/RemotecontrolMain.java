package kr.co.khedu.remotecontrol;

import java.util.ArrayList;

public class RemotecontrolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Remotecontrol rm=new Tv(false); rm.turnOn(); Tv tv2 = null;
		 */
		/*
		 * if(rm instanceof Tv) { tv2 = (Tv)rm; tv2.turnOff();
		 * 
		 * }
		 */
		ArrayList<Remotecontrol> list = new ArrayList<Remotecontrol>();
		list.add(new Tv(true));
		list.add(new Computer(false));
		
		for(Remotecontrol r: list )
		{
			r.turnOn();
		}
	
	
	
	}

}
