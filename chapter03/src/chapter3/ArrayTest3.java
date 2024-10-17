package chapter3;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] arr=new int[4][5];
		int count = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				arr[i][j]=(int)(Math.random()*2);
				
			}
		}
		
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				if(arr[i][j]==1)
				{
					count++;
				}
			}
		}
		
		System.out.println("관객의 숫자는 "+count+"명 입니다.");
		
	}

}
