package kr.co.khedu.box;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상자의 가로길이는? ");
		box.setWidth(sc.nextDouble());	
		System.out.print("상자의 세로길이는? ");
		box.setLength(sc.nextDouble());
		System.out.print("상자의 높이는? ");
		box.setHeight(sc.nextDouble());
		
		System.out.println("상자의 부피는 "+box.boxVolume()+"입니다.");
		
		
	}

}
