package chapter2;

import java.util.Scanner;

public class Calculation3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0,num2 =0,sum = 0;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하시오: ");
		num2 = scanner.nextInt();
		
		sum = num1 + num2;
		System.out.println(""+num1+"과 "+num2+"의 합은 "+sum+"입니다.");
		
	}

}
