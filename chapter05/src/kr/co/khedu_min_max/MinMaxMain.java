package kr.co.khedu_min_max;

public class MinMaxMain {

	public static void main(String[] args) {
		int[] arr = {1,55,49,23,4512,482,9999,1213};
		maxArray(arr);
		minArray(arr);
	}
	
	
	
	
	
	public static void maxArray(int[] data)
	{
		int max = data[0];
		
		for(int i = 1;i<data.length;i++)
		{
			if(max<data[i])
			{
				max = data[i];
			}
		}
		System.out.println(max);
	}
	
	
	public static void minArray(int[] data)
	{
		int min = data[0];
		
		for(int i = 1;i<data.length;i++)
		{
			if(min>data[i])
			{
				min = data[i];
			}
		}
		System.out.println(min);
	}

}
