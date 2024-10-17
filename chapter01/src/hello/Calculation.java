package hello;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in/*키보드*/);
		//1.변수, 상수(주석:)
		double x = 0.0, y=0.0,sum = 0.0; //디폴트값
		//2.계산처리
		System.out.print("input x =");
		x= scanner.nextDouble();
		System.out.print("input y =");
		y= scanner.nextDouble();
		sum = x+y;
		
		//3.출력
		System.out.println("sum="+sum);
		//4.종료
		
		
		
		System.out.println(10+20);
		System.out.println(-(10-20));
		System.out.println(10*20);
		System.out.println(10.0/20*4);
		
	}

}
