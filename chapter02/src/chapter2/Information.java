package chapter2;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		String bloodType =null;
		String age = null;
		System.out.print("input name= ");
		name = scanner.nextLine();
		System.out.print("input bloodType= ");
		bloodType = scanner.nextLine();
		System.out.print("input age= ");
		age = scanner.nextLine();
		
		System.out.println(""+name+"은 "+age+"세고 혈액형은 "+bloodType+"형입니다.");
				
	
	}

}
