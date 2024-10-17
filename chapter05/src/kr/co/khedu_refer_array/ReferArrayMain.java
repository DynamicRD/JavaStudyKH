package kr.co.khedu_refer_array;

public class ReferArrayMain {

	public static void main(String[] args) {
		//정수형 배열
		int[] intArray = new int[3];
		for(int i = 0;i<intArray.length;i++)
		{
			intArray[i] = 10*(i+1);
		}
		for(int i = 0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		//Rectangle 클래스참조배열
		Rectangle[] ra = new Rectangle[3];
		for(int i = 0;i<ra.length;i++)
		{
			ra[i] = new Rectangle((i+1)*10,(i+1)*10);
		}
		for(int i = 0;i<ra.length;i++)
		{
			System.out.println(ra[i].getArea());
		}
	}

}
