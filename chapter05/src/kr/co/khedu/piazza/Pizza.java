package kr.co.khedu.piazza;

public class Pizza {
	private int radius;

	public Pizza(int radius) {
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Pizza [radius=" + radius + "]";
	}
	
	public static Pizza WhosLargest(Pizza p1,Pizza p2)
	{
		if(p1.getRadius() > p2.getRadius())
		{
			return p1;
		}
		return p2;
	}

}
