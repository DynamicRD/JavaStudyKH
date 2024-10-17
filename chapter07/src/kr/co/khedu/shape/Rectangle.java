package kr.co.khedu.shape;

public class Rectangle extends Shape {
	private int area;
	
	public Rectangle(int x, int y) {
		super(x, y);
		area = 0;
	}

	@Override
	public void draw() {
		area = getX()*getY();
		System.out.println("Rectangle 면적은 "+area);
	}

}
