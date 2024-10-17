package chapter3;

public class StarDot3Diamond {

	public static void main(String[] args) {

		for(int i = 0;i<11 ; i++)
		{
			if(i<5) {
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
			}else{
				for(int j = 0;j<-5+i;j++)
				{
					System.out.print("_");
				}
				for(int j = 0;j<11-(2*i-10);j++)
				{
					System.out.print("*");
				}
				for(int j = 0;j<-5+i;j++)
				{
					System.out.print("_");
				}
			}
				
			
			System.out.println();
		}
	
	}

}
