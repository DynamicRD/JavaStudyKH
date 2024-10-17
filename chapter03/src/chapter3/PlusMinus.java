package chapter3;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		System.out.print("정수를 입력하시오: ");
		data = sc.nextInt();
		
		if(data > 0)
		{
			System.out.println("양수입니다.");
		}else if(data == 0)
		{
			System.out.println("0입니다.");
		}else
		{			
			System.out.println("음수입니다.");
		}
	}

}
