package chapter3;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("양의 정수를 입력하시오: ");
		num = sc.nextInt();
		System.out.printf("%d의 약수는 다음과 같습니다.\n",num);
		for(int i = 1;i<=num;i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
