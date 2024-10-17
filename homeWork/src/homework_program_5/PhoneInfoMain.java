package homework_program_5;

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
			case Menu.NEW_HUMAN:
				newHuman(list);
				break;
			case Menu.SEARCH_DATA:
				searchData(list);
				break;
			case Menu.DELETE_DATA:
				deleteData(list);
				break;
			case Menu.EXIT:
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
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		boolean exitFlag=false;
		int choice = 0;
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case Menu.DEFAULT_HUMAN:
			newNormal(list);
			break;
		case Menu.UNIVERSITY_HUMAN:
			if(Manager.getPui().getPhoneNumber() != null)
			{
				System.out.println("이미 PhoneUnivInfo클래스의 인스턴스가 존재합니다.");
				break;
			}
			newUniversity(list);
			break;
		case Menu.COMPANY_HUMAN:
			newCompany(list);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			exitFlag = true;
			break;
		}
		if(exitFlag = false)
		System.out.println("데이터의 입력이 완료되었습니다.");
	}
	
	public static void newNormal(List<PhoneInfo> list)
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		if(isSameNumberThere(list,phoneNumber) == true)
		{
			System.out.println("중복번호가 있습니다.");
			return;
		}
		list.add(new PhoneInfo(name,phoneNumber));
	}
	public static void newUniversity(List<PhoneInfo> list)
	{
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		if(isSameNumberThere(list,phoneNumber) == true)
		{
			System.out.println("중복번호가 있습니다.");
			return;
		}
		System.out.print("전공 : ");
		String major = sc.nextLine();
		System.out.print("학년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		Manager.getPui().setName(name);
		Manager.getPui().setPhoneNumber(phoneNumber);
		Manager.getPui().setMajor(major);
		Manager.getPui().setYear(year);
		list.add(Manager.getPui());
	}
	public static void newCompany(List<PhoneInfo> list)
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		if(isSameNumberThere(list,phoneNumber) == true)
		{
			System.out.println("중복번호가 있습니다.");
			return;
		}
		System.out.print("회사 : ");
		String company = sc.nextLine();
		list.add(new PhoneCompanyInfo(name,phoneNumber,company));
	}
	
	public static void searchData(List<PhoneInfo> list) {
		System.out.print("찾을사람의 전화번호를 입력하세요. ");
		String phoneNumber = sc.nextLine();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getPhoneNumber().equals(phoneNumber))
			{
				System.out.println("데이터 검색을 시작합니다.");
				System.out.println("name : "+list.get(i).getName());
				System.out.println("phone : "+list.get(i).getPhoneNumber());
				if(list.get(i) instanceof PhoneUnivInfo)
				{
					PhoneUnivInfo pui = null;
					pui = (PhoneUnivInfo)list.get(i);
					System.out.println("major : "+pui.getMajor());
					System.out.println("year : "+pui.getYear());
				} else if(list.get(i) instanceof PhoneCompanyInfo)
				{
					PhoneCompanyInfo pci = null;
					pci = (PhoneCompanyInfo)list.get(i);
					System.out.println("major : "+pci.getCompany());
				}
				System.out.println("데이터의 검색이 완료되었습니다.");
				System.out.println();
				return;
			}
		}
		System.out.println("해당사람은 없습니다.");
		System.out.println();
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
				if(phoneNumber == Manager.getPui().getPhoneNumber())
				{
					Manager.getPui().setName(null);
					Manager.getPui().setPhoneNumber(null);
					Manager.getPui().setMajor(null);
					Manager.getPui().setYear(0);
				}
				list.remove(i);
				System.out.println("데이터의 삭제가 완료되었습니다.");
				System.out.println();
				return;
			}
		}
		System.out.println("해당사람은 없습니다.");
		System.out.println();
	}
	
	public static boolean isSameNumberThere(List<PhoneInfo> list,String phoneNumber)
	{
		if(list.size() == 0)
		{
			return false;
		}
		for(int i = 0;i<list.size();i++)
		{
			if(phoneNumber.equals(list.get(i).getPhoneNumber()))
				return true;
		}
		return false;
	}
}