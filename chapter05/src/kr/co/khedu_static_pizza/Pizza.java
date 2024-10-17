package kr.co.khedu_static_pizza;

public class Pizza {
	private int radius;
	private String toppings;
	public static final double PI = 3.141592;
	public static int count = 0;
	
	
	
	public Pizza(int radius, String toppings) {
		this.radius = radius;
		this.toppings = toppings;
		Pizza.count++;
	}

	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}



	@Override
	public String toString() {
		return "Pizza [radius=" + radius + ", toppings=" + toppings + "]";
	}
	
	
	public void printMember()
	{
		System.out.println(toppings);
		System.out.println(radius);
		System.out.println(Pizza.count);
		System.out.println(Pizza.PI);
	}
	public static void sPrintMember()
	{

		System.out.println(Pizza.count);
		System.out.println(Pizza.PI);
	}
}
