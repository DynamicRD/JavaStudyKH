package kr.co.kh.lamp;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		DeskLamp deskLamp = new DeskLamp();
		System.out.println("0.램프에 불켜기");
		System.out.print("1.램프에 불끄기");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 0:
			deskLamp.turnOn();
			break;
		case 1:
			deskLamp.turnOff();
			break;
		}
		
		System.out.println("램프의 상태는 "+(deskLamp.getDeskLamp()?"켜짐":"꺼짐"));
		
	}

}
