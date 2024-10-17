package kr.co.kh.lamp;

public class DeskLamp {
	private boolean isOn;
	
	public void turnOn()
	{
		isOn = true;
	}
	
	public void turnOff()
	{
		isOn = false;
	}
	
	public void setDeskLamp(boolean isOn)
	{
		this.isOn = isOn;
	}
	
	public boolean getDeskLamp()
	{
		return isOn;
	}
}
