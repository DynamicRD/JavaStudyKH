package chapter2;

import java.util.Scanner;

public class AddThreeRealNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1 = 0.0, num2 =0.0,num3 =0.0,
				sum = 0.0;
		
		System.out.print("첫번째 실수를 입력하세요: ");
		num1 = scanner.nextDouble();
		System.out.print("두번째 실수를 입력하세요: ");
		num2 = scanner.nextDouble();
		System.out.print("세번째 실수를 입력하세요: ");
		num3 = scanner.nextDouble();
		
		sum = num1+num2+num3;
		System.out.println(""+num1+"+"+num2+"+"+num3+" = "+sum+"");
		
	}

}
