package chapter3;

import java.util.Scanner;

public class OvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		System.out.print("정수를 입력하시오: ");
		data = sc.nextInt();
		
		if(data % 2 == 0)
		{
			System.out.println("입력된 정수는 짝수입니다.");
		}else if(data % 2 == 1)
		{
			System.out.println("입력된 정수는 홀수입니다.");			
		}
	}

}
