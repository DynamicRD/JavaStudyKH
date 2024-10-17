package kr.co.khedu;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = 0;
		String color = null;
		
		System.out.print("구의 반지름을 입력하세요: ");
		radius = sc.nextInt();
		
		Sphere sphere = new Sphere(radius);
		sphere.setColor("빨간색");
		System.out.println("구의 반지름은 :"+sphere.getRadius());
		System.out.println("구의 색깔은 :"+sphere.getColor());
		System.out.println("구의 부피는 :"+sphere.SphereVolume());
		
		
	}

}
