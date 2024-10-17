package kr.co.khedu_e_car;

public class ECar {
	private static ECar instance = new ECar();
	private int battery;
	private int distance;
	
	private ECar() {
		battery = 100;
	};
	
	public static ECar getInstance()
	{
		return instance;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "ECar [battery=" + battery + ", distance=" + distance + "]";
	}
	
	public void dispDistance()
	{
		System.out.println("총 주행거리는 "+distance+"km 입니다.");
	}
	
	public void disBattery()
	{
		System.out.println("배터리 잔량은 "+battery+"% 입니다.");
	}
	
	public void drive()
	{
		if(battery < 10)
		{
			System.out.println("배터리 잔량이 부족하여 운전할수 없습니다.");
			return;
		}
		
		battery -=10;
		distance +=1;
		System.out.println("1km 운행완료");
	}
	
}
