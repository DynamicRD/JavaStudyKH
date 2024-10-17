package kr.co.khedu.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
	public static void main(String[] args)
	{

		List<Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(10,20));
		list.add(new Circle(10,20,7));
	
		for(Shape num : list)
		{
			num.draw();
		}
	}

}
