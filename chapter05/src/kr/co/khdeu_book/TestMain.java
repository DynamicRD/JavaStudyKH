package kr.co.khdeu_book;

import java.util.Scanner;

class TestMain {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean exitFlag = false;
		
		for(;!exitFlag;) {
		//화면메뉴출력
		dispMenu();
		int menuNo = sc.nextInt();
		
		switch(menuNo)
		{
		case 1: 
			System.out.println("1.책등록");
			break;
		case 2: 
			System.out.println("2.책검색");
			break;
		case 3: 
			System.out.println("3.전체출력");
			break;
		case 4:
			System.out.println("프로그램 종료");
			exitFlag = true;
			break;
			}
		}
		System.out.println("The end");
	}

	
	
	
	public static void dispMenu() {
		//화면메뉴출력
		System.out.println("======================");
		System.out.println("1.책 등록");
		System.out.println("2.책 검색");
		System.out.println("3.전체출력");
		System.out.println("4.종료");
		System.out.println("======================");
		System.out.println("번호를 입력 요망");
	}
}
