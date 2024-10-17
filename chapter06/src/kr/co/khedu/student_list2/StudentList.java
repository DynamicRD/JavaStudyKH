package kr.co.khedu.student_list2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean exitFlag = false;
		ArrayList<Student> stdArray = new ArrayList<Student>();
		
		for(;!exitFlag;)
		{
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default :
				break;
			}
			
			
			
			
		}
		
		
		
	}
//--------------------------------------------------------------------
	public static void displayMenu()
	{
		System.out.println("--------------------------");
		System.out.println("1.성적 입력하기");			
		System.out.println("2.성적 검색하기");			
		System.out.println("3.전체 출력하기");			
		System.out.println("4.성적 삭제하기");						
		System.out.println("5.성적 수정하기");			
		System.out.println("6.성적 순위보기");			
		System.out.println("7.종료하기");						
		System.out.println("--------------------------");
		System.out.print("번호를 입력하시오");
	}
}
