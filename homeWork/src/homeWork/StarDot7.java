package homeWork;

public class StarDot7 {

	public static void main(String[] args) {
		for(int i = 0;i<11;i++)
		{
			if(i<5) {
				for(int j = 0;j<i+1;j++)
				{
					System.out.print("*");				
				}		
			}else {
				for(int j = 0;j<6-(i-5);j++)
				{
					System.out.print("*");				
				}			
			}
			System.out.println();		
		}
		
	}

}
