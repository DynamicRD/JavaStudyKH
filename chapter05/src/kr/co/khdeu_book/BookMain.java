package kr.co.khdeu_book;

import java.util.Scanner;

public class BookMain {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean exitFlag = false;
		Book[] bookArray = new Book[20];
		
		for(;!exitFlag;) {
		//화면메뉴출력
		dispMenu();
		int menuNo = sc.nextInt();
		
		switch(menuNo)
		{
		case 1: 
			insertBook(bookArray);
			break;
		case 2: 
			findBooks(bookArray);
			break;
		case 3: 
			printBooks(bookArray);
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
	
	public static void insertBook(Book[] bookArray) {
		System.out.print("번호를 입력하세요: ");
		int no = sc.nextInt();
		System.out.print("제목을 입력하세요: ");
		sc.nextLine();//버퍼 제거
		String title = sc.nextLine();
		System.out.print("평점을 입력하세요: ");
		int score = sc.nextInt();
		Book book = new Book(no,title,score);
		bookArray[no-1]= book;
	}
	
	public static void printBooks(Book[] bookArray) {
		for(int i = 0;i<bookArray.length;i++)
		{
			if(bookArray[i]==null)
				continue;
			System.out.println(bookArray[i].toString());
		}
	}
	
	public static void findBooks(Book[] bookArray) {
		 boolean findFlag = false;
		 System.out.print("검색할 제목: ");
		 sc.nextLine();
		 String title = sc.nextLine();
		 for(int i = 0;i<bookArray.length;i++)
		 {
			 if(bookArray[i]!=null&&bookArray[i].getTitle().equals(title))
			 {
				 System.out.println(bookArray[i]);
				 findFlag = true;
				 break;
			 }
			 
		 }
		 if(findFlag == false)
		 {
			 System.out.println(title+"책은 없습니다.");
		 }
		 
	}
}
