package kr.co.khedu.numberformatexception;

import java.util.Scanner;

public class numberFormatExceptionMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int number = 0;
		
		
		try {
			number = Integer.parseInt("123K");
		}catch(NumberFormatException e){
			System.out.println("오류 발생");
			number = 100;
		}catch(Exception e)
		{
			System.out.println("Exception까지 갔다");
			e.printStackTrace();
		}
		finally {
			
		}
		
		System.out.println(number+1);
		System.out.println("TheEnd");
	}

}
