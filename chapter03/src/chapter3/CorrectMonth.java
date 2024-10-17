package chapter3;

import java.util.Scanner;

public class CorrectMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		while(month<1 || month >12)
		{
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = sc.nextInt();
		}
		
		System.out.printf("사용자가 입력한 월은 %d",month);
	}

}
