package kr.co.khedu.shape;

public class Circle extends Shape {
	public static final double PI = 3.141592;
	private double area;
	private int radius;
	
	public Circle(int x, int y,int radius) {
		super(x, y);
		this.radius = radius;
		area = 0;
	}

	@Override
	public void draw() {
		area = PI * Math.pow(radius, 2);
		String data = String.format("%.2f", area);
		System.out.println("Circle 면적은 "+data);
	}

}
