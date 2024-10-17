package kr.co.khedu.random_integer_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMain {

	public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i = 0;i<10;i++)
			{
				list.add((int)(Math.random()*10 +1));
			}
			Collections.sort(list);
			for(int num:list)
			{
				System.out.print(num+" ");
			}
			Collections.reverse(list);
			System.out.println();
			for(int num:list)
			{
				System.out.print(num+" ");
			}
		}

	}


