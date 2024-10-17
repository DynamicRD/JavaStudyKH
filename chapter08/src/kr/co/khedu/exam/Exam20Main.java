package kr.co.khedu.exam;

public class Exam20Main {

	public static void main(String[] args) {
		Integer[] arr = {1,55,22,66,77,99};
		System.out.println(calMaxArray(arr));
	
	}

	private static int calMaxArray(Integer[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
				if(max<arr[i]) 
				max = arr[i];
			}
		return max;
		
	}
	
	
	
	
}
