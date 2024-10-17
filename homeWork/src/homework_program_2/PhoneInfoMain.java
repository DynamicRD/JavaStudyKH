package homework_program_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneInfoMain {
	public static Scanner sc = new Scanner(System.in);
//--------------------------------------
	public static void main(String[] args) {
	
		List<PhoneInfo> list = new ArrayList<PhoneInfo>();
		int choice = 0;
		boolean exitFlag =false;
		
		for(;!exitFlag;)
		{
			printMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				newHuman(list);
				break;
			case 2:
				System.out.println("프로그램 종료됐습니다.");
				exitFlag = true;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
//--------------------------------------------------
	public static void printMenu()
	{
		System.out.println("선택하세요");
		System.out.println("1. 데이터입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void newHuman(List<PhoneInfo> list)
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		String birthday = sc.nextLine();
		list.add(new PhoneInfo(name,phoneNumber,birthday));
		System.out.println();
		System.out.println("입력된 정보 출력…");
		System.out.println("name : "+list.get(list.size()-1).getName());
		System.out.println("phone : "+list.get(list.size()-1).getPhoneNumber());
		System.out.println("birth : "+list.get(list.size()-1).getBirthday());
		System.out.println();
	}
}
