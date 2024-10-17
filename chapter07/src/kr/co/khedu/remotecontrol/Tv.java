package kr.co.khedu.remotecontrol;

public class Tv extends Object implements Remotecontrol {
	//멤버
	private boolean isOn;
	
	
	public Tv(boolean isOn) {
		super();
		this.isOn = isOn;
	}




	public void turnOn() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Tv객체서 tvOn = "+isOn);
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		isOn = false;
		System.out.println("Tv객체서 tvOn = "+isOn);
		
	}

	
}
