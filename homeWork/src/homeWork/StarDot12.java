package homeWork;

public class StarDot12 {

	public static void main(String[] args) {
		for(int i = 0;i<9;i++)
		{
			if(i<5) {
				for(int j = 0;j<5-i;j++)
				{
					System.out.print("*");				
				}
				for(int j = 0;j<2*(i+1)-1;j++)
				{
					System.out.print(" ");				
				}				
				for(int j = 0;j<5-i;j++)
				{
					System.out.print("*");				
				}				
			}else {
				for(int j = 0;j<i-3;j++)
				{
					System.out.print("*");				
				}			
				for(int j = 0;j<11-2*(i-3);j++)
				{
					System.out.print(" ");				
				}			
				for(int j = 0;j<i-3;j++)
				{
					System.out.print("*");				
				}			
			}
			System.out.println();		
		}
		
	}

}
