package kr.co.khedu.shape3;

public class Rectangle extends Shape {
	
	public Rectangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void area() {
		System.out.println("Rectangle의 넓이는 "+super.getX()*super.getY());
	}
	
}
