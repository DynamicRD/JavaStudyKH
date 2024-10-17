package kr.co.khedu.shape3;

public class Shape {
	private int x;
	private int y;
	
	public Shape() {
		this(0,0);
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	public void area() {
		System.out.println("오버라이딩 대상자");
	}
}
