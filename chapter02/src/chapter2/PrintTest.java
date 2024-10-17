package chapter2;

import java.util.Scanner;

public class PrintTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=0,y=0,z=0,sum;

		System.out.print("input x=");
		x = scanner.nextInt();
		System.out.print("input y=");
		y = scanner.nextInt();
		System.out.print("input z=");
		z = scanner.nextInt();
		
		sum = x+y+z;
		System.out.println(""+x+" + "+y+" + "+z+" = "+sum+" 입니다" );
	
	}

}
