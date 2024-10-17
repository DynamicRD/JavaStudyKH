package kr.co.khedu_shape;

public class Circle extends Shape {
	private int radius;
	public static final double PI = 3.141592;

	public Circle(int x, int y, int radius) {
		super(x, y);
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
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea()
	{
		return radius*radius*PI;
	}
}
