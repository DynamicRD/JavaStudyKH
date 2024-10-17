package kr.co.khedu.comparable;

public class ComparableMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,10);
		Rectangle r2 = new Rectangle(9,9);
		
		int data = r1.compareTo(r2);
		if(data == 0) {
			System.out.println("두 객체의 크기가 같습니다.");
		}else if(data>0)
		{
			System.out.println("r1 객체가 큽니다.");			
		}else
		{
			System.out.println("r2 객체가 큽니다.");			
		}
	}

}
