package chapter3;

import java.util.Scanner;

public class UntilMinusOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0,sum = 0;
		
		
		for(;num != -1;)
		{
			sum += num;
			System.out.print("정수를 입력하시오: ");
			num = sc.nextInt();
		}
		
		System.out.printf("정수의 합은 %d입니다.",sum);
		
	}

}
