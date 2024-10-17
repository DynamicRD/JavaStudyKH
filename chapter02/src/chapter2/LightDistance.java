package chapter2;

import java.util.Scanner;

public class LightDistance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double LIGHT_SPEED_PER_SEC = 3e5;
		double distance = 0.0;
		int day = 0;
		
		System.out.print("빛이 몇일동안 간 거리를 구할까요? : ");
		day = scanner.nextInt();
		
		distance = LIGHT_SPEED_PER_SEC*day*24*60*60;
		System.out.println("빛이 "+day+"일 동안 가는 거리 : "+
				distance+"km");
		
		
		
	}
	
	
}
