package kr.co.khedu.shape3;

public class Triangle extends Shape {

	public Triangle(int x, int y) {
		super(x, y);
	}
	@Override
	public void area()
	{
		System.out.println("Triangle의 넓이는 "+this.getX()*this.getY()/2.0);
	}
}
