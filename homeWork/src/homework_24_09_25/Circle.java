package homework_24_09_25;

public class Circle {
	private double radius;
	private String color;
	public static final double PI = 3.141592;
	public Circle() {
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double area()
	{
		return radius*radius*PI;
	}
	
}
