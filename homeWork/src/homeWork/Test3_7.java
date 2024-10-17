package homeWork;

public class Test3_7 {

	public static void main(String[] args) {
		int sum =0;
		for(int i = 1;i<=30;i++)
		{
			sum += i*i + 1;
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i = 10;i<= 30;i++)
		{
			for(int j = 0;j<=5;j++)
			{
				sum += i* j;
			}
		}
		System.out.println(sum);
		
	}

}
