package kt.co.khedu.array;

import java.util.Arrays;
import java.util.Collections;

public class StringArrayMain {

	public static void main(String[] args) {
		String[] arr = {"aaa","ccc","fff","eee","kkk"};
		
		printArray(arr);
		System.out.println("==============");
		Arrays.sort(arr);
		printArray(arr);
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("==============");
		printArray(arr);
	}

	private static void printArray(String[] arr) {
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
