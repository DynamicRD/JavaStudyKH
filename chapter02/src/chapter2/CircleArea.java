package chapter2;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.141592;
		double radius = 0.0,area = 0.0;
		
		System.out.print("반지름의 길이는? : ");
		radius = scanner.nextDouble();
		area = PI * radius * radius;
		System.out.println("반지름이 "+radius+"인 원의 면적은 "
				+area+"입니다.");
		
	}

}
