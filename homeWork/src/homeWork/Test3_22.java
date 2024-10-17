package homeWork;

import java.util.Scanner;

public class Test3_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("몇단까지 구구단을 구할까? ");
		num = sc.nextInt();
		
		for(int i = 2;i <= num;i++)
		{
			System.out.println(i+"단");
			for(int j = 1;j<=9;j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
			
		}
	
	}
	
}
