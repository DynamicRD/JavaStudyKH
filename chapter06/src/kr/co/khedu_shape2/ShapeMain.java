package kr.co.khedu_shape2;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shape = new Shape[] 
				{new Circle(),new Triangle(),new Rectangle()};
		for(int i = 0;i<shape.length;i++)
		{
			shape[i].draw();
		}
	
	
	}

}
