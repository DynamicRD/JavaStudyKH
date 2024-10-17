package chapter2;

import java.util.Scanner;

public class SecondToMinute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sec = 0,min =0,sec2 = 0;
		
		System.out.print("초를 입력하세요 : ");
		sec = scanner.nextInt();
		
		min = sec / 60;
		sec2 = sec % 60;
		
		System.out.print(""+sec+"초는 "+min+"분 "+sec2+"초 입니다.");
	}

}

