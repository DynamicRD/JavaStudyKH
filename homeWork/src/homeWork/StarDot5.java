package homeWork;

public class StarDot5 {

	public static void main(String[] args) {
		for(int i = 0;i<11;i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");				
			}
			for(int j = 0;j<11-2*(i);j++)
			{
				System.out.print("*");				
			}			
			System.out.println();
		}
		
	}

}
