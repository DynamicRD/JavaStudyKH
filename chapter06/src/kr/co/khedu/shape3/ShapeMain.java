package kr.co.khedu.shape3;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shapeArr = new Shape[] {new Rectangle(10,20),new Triangle(10,20)};
		
		for(int i = 0;i<shapeArr.length;i++)
		{
			shapeArr[i].area();
		}
		
		ArrayList<Shape> shapeArrList = new ArrayList<Shape>();
		shapeArrList.add(new Rectangle(10,20));
		shapeArrList.add(new Triangle(10,20));
		
		for(int i = 0;i<shapeArrList.size();i++)
		{
			shapeArrList.get(i).area();
		}
		
		Shape s;
		s = new Rectangle(10,20);
		
		if(s instanceof Rectangle)
			System.out.println("s는 Rectangle의 부모");
		else if(s instanceof Triangle)
			System.out.println("s는 Triangle의 부모");
	}

}
