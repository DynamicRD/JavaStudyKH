package chapter3;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long factorial = 1;
		int num = 0;
		
		System.out.print("정수를 입력하시요:");
		num = sc.nextInt();
		
		for(int i = 0;i<num ; i++)
		{
			factorial *= i+1;
		}
		
		System.out.println(""+num+"!은 "+factorial+"입니다.");
		
		
		
		
		
	}
}
