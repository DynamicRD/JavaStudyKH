package homework_program_4_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneInfoMain {
	public static Scanner sc = new Scanner(System.in);
	
//--------------------------------------
	public static void main(String[] args) {
	
		HashMap<String,PhoneInfo> list = new HashMap<>();
		int choice = 0;
		boolean exitFlag =false;
		//중복이 일어나면 list.add(pi) =>false,중복없으면 =>true 반환
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
	
	public static void newHuman(HashMap<String,PhoneInfo> list)
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
	
	public static void newNormal(HashMap<String,PhoneInfo> list)
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		PhoneInfo pi = new PhoneInfo(name,phoneNumber);
		if(list.put(phoneNumber, pi)==null) {
			System.out.println("");
		}
	}
	public static void newUniversity(HashMap<String,PhoneInfo> list)
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
	//	list.add(new PhoneUnivInfo(name,phoneNumber,major,year));
	}
	public static void newCompany(HashMap<String,PhoneInfo> list)
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		/*
		 * if(isSameNumberThere(list,phoneNumber) == true) {
		 * System.out.println("중복번호가 있습니다."); return; }
		 */
		System.out.print("회사 : ");
		String company = sc.nextLine();
		//list.add(new PhoneCompanyInfo(name,phoneNumber,company));
	}
	
	public static void searchData(HashMap<String,PhoneInfo> list) {
		System.out.print("찾을사람의 전화번호를 입력하세요. ");
		PhoneInfo phoneNumber = null;
		//Map에 있는 key객체를 set으로 바꿔준다
		Set <String>  set= list.keySet();
		Iterator<String> it  = set.iterator();

		
		while(it.hasNext())
		{
			String strKey = it.next();
			if(strKey.equals(phoneNumber)) {
				phoneNumber = list.get(strKey);
				break;
			}
		}
		/*
		 * for(int i=0;i<list.size();i++) {
		 * if(list.get(i).getPhoneNumber().equals(phoneNumber)) {
		 * System.out.println("데이터 검색을 시작합니다.");
		 * System.out.println("name : "+list.get(i).getName());
		 * System.out.println("phone : "+list.get(i).getPhoneNumber()); if(list.get(i)
		 * instanceof PhoneUnivInfo) { PhoneUnivInfo pui = null; pui =
		 * (PhoneUnivInfo)list.get(i); System.out.println("major : "+pui.getMajor());
		 * System.out.println("year : "+pui.getYear()); } else if(list.get(i) instanceof
		 * PhoneCompanyInfo) { PhoneCompanyInfo pci = null; pci =
		 * (PhoneCompanyInfo)list.get(i);
		 * System.out.println("major : "+pci.getCompany()); }
		 * System.out.println("데이터의 검색이 완료되었습니다."); System.out.println(); return; } }
		 * System.out.println("해당사람은 없습니다."); System.out.println();
		 */
	}
	public static void deleteData(HashMap<String,PhoneInfo> list) {
		System.out.print("삭제할 사람의 전화번호를 입력하세요. ");
		String phoneNumber = sc.nextLine();
		
		
		Set <String> set = list.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String strKey = it.next();
			if(strKey.equals(phoneNumber)) {
				list.remove(strKey);
				break;
			}
		}
	}
	public static void printData(HashMap<String,PhoneInfo> list) {
		Set <String> set = list.keySet();
		Iterator<String> it = set.iterator();
		
	for(;it.hasNext();){
	}
	}
	
	public static boolean isSameNumberThere(HashMap<String,PhoneInfo> list,String phoneNumber)
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