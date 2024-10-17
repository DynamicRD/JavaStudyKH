package chapter3;

public class StarDot3Left {

	public static void main(String[] args) {

		
		for(int i = 0;i<6 ; i++)
		{
			for(int j = 0;j<5-i;j++)
			{
				System.out.print("_");
			}
			for(int j = 0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			for(int j = 0;j<5-i;j++)
			{
				System.out.print("_");
			}
			System.out.println();
		}
		
		for(int i = 0;i<6 ; i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print("_");
			}
			for(int j = 0;j<11-(2*i);j++)
			{
				System.out.print("*");
			}
			for(int j = 0;j<i;j++)
			{
				System.out.print("_");
			}
			System.out.println();
		}
	}

}
