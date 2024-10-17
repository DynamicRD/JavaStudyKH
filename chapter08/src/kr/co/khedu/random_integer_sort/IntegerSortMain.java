package kr.co.khedu.random_integer_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IntegerSortMain {

	public static void main(String[] args) {
		Integer[] list = new Integer[10];
		
		for(int i = 0;i<list.length;i++)
		{
			list[i] = (int)(Math.random()*10 +1);
		}
		
		Arrays.sort(list);
		for(int num:list)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(list,Collections.reverseOrder());
		for(int num:list)
		{
			System.out.print(num+" ");
		}
		
	}

}
