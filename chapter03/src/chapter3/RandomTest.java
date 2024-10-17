package chapter3;

public class RandomTest {

	public static void main(String[] args) {

		
		
		for(int i=0;i<10;i++)
		{
			int num = (int)(Math.random()*(669-(-127)+1)+(-127));
			System.out.println(num);
			
		}
	}

}
