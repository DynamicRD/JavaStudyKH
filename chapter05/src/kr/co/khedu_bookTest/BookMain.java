package kr.co.khedu_bookTest;

import java.util.Scanner;

public class BookMain {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		Book[] book = new Book[20];
		
		while(true)
		{
			System.out.println("====================");
			System.out.println("1. 책등록");
			System.out.println("2. 책검색");
			System.out.println("3. 전체출력");
			System.out.println("4. 종료");
			System.out.println("====================");
			System.out.println("번호입력");
			choice = sc.nextInt();
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
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}		
			
		}
				
	}
	
	public static void newBook(Book[] book)
	{
		int no = 0;
		System.out.print("책 번호를 입력하시오");
		no = sc.nextInt();
		sc.nextLine();
		if(no<1 || no>20)
		{
			System.out.println("번호가 범위에서 벗어났습니다.");
			return;
		}
		String title = null;
		System.out.print("책 제목을 입력하시오");
		title = sc.nextLine();
		int score = 0;
		System.out.print("책 평점을 입력하시오");
		no = sc.nextInt();
		sc.nextLine();
		if(score<0 || score>10)
		{
			System.out.println("평점은 0이상 10이하여야 합니다.");
			return;
		}
		book[no-1] = new Book(no,title,score); 
	}

}
