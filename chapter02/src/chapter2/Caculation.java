package chapter2;

import java.util.Scanner;

public class Caculation{
	
	public static void main(String[] args){
		//입력객체
		Scanner scanner = new Scanner(System.in);
		//1.변수,상수
		int x=0,y=0,z=0;
		//2.계산처리
		System.out.print("x의 값은?");
		x = scanner.nextInt();
		System.out.print("y의 값은?");
		y = scanner.nextInt();
		System.out.print("z의 값은?");
		z = scanner.nextInt();
	
		//3.출력
		System.out.println("x,y,z의 값은 각각"+x+","+y+","+z);
		//4.종료


	}
}