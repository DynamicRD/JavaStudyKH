package homework_program_3;

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
//				searchData(list);
				break;
			case 3:
				deleteData(list);
				break;
			case 4:
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
		System.out.println("2. 데이터검색");
		System.out.println("3. 데이터삭제");
		System.out.println("4. 프로그램 종료");
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
	
//	public static void searchData(List<PhoneInfo> list) {
//		System.out.print("찾을사람의 전화번호를 입력하세요. ");
//		String phoneNumber = sc.nextLine();
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getPhoneNumber().equals(phoneNumber))
//			{
//				System.out.println("데이터 검색을 시작합니다.");
//				System.out.println("name : "+list.get(i).getName());
//				System.out.println("phone : "+list.get(i).getPhoneNumber());
//				System.out.println("birth : "+list.get(i).getBirthday());
//				System.out.println("데이터의 검색이 완료되었습니다.");
//				System.out.println();
//				return;
//			}
//		}
//		System.out.println("해당사람은 없습니다.");
//		System.out.println();
//	}
	
	public static PhoneInfo searchData(List<PhoneInfo> list,String phoneNumber) {
	PhoneInfo pi = null;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPhoneNumber().equals(phoneNumber))
			{
				pi = list.get(i);
				break;
			}
		}
		return pi;
	}
	
	public static void deleteData(List<PhoneInfo> list) {
		System.out.print("삭제할 사람의 전화번호를 입력하세요. ");
		String phoneNumber = sc.nextLine();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPhoneNumber().equals(phoneNumber))
			{
				System.out.println("데이터 삭제를 시작합니다.");
				System.out.println("name : "+list.get(i).getName());
				list.remove(i);
				System.out.println("데이터의 삭제가 완료되었습니다.");
				System.out.println();
				return;
			}
		}
		System.out.println("해당사람은 없습니다.");
		System.out.println();
	}
}
