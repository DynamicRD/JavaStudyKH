package kr.co.khedu_e_car;

import java.util.Scanner;

public class ECarMain {

	public static void main(String[] args) throws InterruptedException {
		ECar eCar = ECar.getInstance();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		System.out.print("고갱님 차를 몇키로 운행하길 희망하시나요? ");
		data =sc.nextInt();
		
		System.out.println("자동차 운행시작.");
		for(;true;)
		{
			Thread.sleep(1000);
			eCar.drive();
			eCar.dispDistance();
			eCar.disBattery();
			//if(eCar.getBattery())
		}
		
		/*
		 * eCar.drive(); eCar.disBattery(); eCar.dispDistance();
		 * 
		 * for(int i = 0;i<12;i++) { Thread.sleep(500); eCar.drive(); }
		 * eCar.disBattery(); eCar.dispDistance();
		 */
	}
	
}
