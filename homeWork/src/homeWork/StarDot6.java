package homeWork;

public class StarDot6 {

	public static void main(String[] args) {
		for(int i = 0;i<11;i++)
		{
			for(int j = 0;j<10-i;j++)
			{
				System.out.print(" ");				
			}
			for(int j = 0;j<1+2*i;j++)
			{
				System.out.print("*");				
			}			
			System.out.println();
		}
		
	}

}
