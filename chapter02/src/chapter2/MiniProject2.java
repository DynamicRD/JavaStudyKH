package chapter2;

import java.util.Scanner;

public class MiniProject2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = 0.0;
		double celsius  = 0.0;
		System.out.print("화씨온도를 입력하시오: ");
		fahrenheit = sc.nextDouble();
		celsius =  (fahrenheit - 32.0) / 1.8 ;
		System.out.print("화씨 "+fahrenheit+"도는 섭씨 "+celsius+"도 입니다.");
	System.exit(0);
	}

}
