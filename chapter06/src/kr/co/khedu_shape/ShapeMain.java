package kr.co.khedu_shape;

public class ShapeMain {

	public static void main(String[] args) {
		Circle circle = new Circle(0,0,10);
		System.out.println("원의 중심: ("+circle.getX()+", "+circle.getY()+")");
		System.out.println("원의 넓이: "+circle.getArea());
	}

}
