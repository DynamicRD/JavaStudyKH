package chapter2;

import java.util.Scanner;

public class MiniProjectTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = 0.0;
		double celsius  = 0.0;
		int choice = 0;
		
		System.out.println("=====================================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=====================================");

		System.out.print("번호를 선택하시오: ");
		choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.print("화씨온도를 입력하시오: ");
			fahrenheit = sc.nextDouble();
			celsius =  (fahrenheit - 32.0) / 1.8 ;
			System.out.println("섭씨온도는 "+celsius+"");
			System.out.println("The end");
			System.exit(0);
		}else if (choice == 2)
		{
			System.out.print("섭씨온도를 입력하시오: ");
			celsius = sc.nextDouble();
			fahrenheit = celsius*9.0/5.0 + 32.0; 
			System.out.println("화씨온도는 "+fahrenheit+"");
			System.out.println("The end");
		    System.exit(0);
				
		}else
		{
			System.out.println("잘못된 입력으로 종료합니다.");
			System.out.println("The end");
			System.exit(0);
		}
		
		
	}

}
