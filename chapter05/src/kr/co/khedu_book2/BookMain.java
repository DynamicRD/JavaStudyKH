package kr.co.khedu_book2;

import java.util.Scanner;

public class BookMain {
	public static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) throws InterruptedException {
		int choice = 0;
		Book[] book = new Book[30];
		
		while(true)
		{
			System.out.println("--------------------");
			System.out.println("1. 책등록");
			System.out.println("2. 책검색");
			System.out.println("3. 전체출력");
			System.out.println("4. 종료");
			System.out.println("--------------------");
			System.out.print("번호를 입력하시오");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				insertBook(book);
				break;
			case 2:
				findBook(book);
				break;
			case 3:
				showBook(book);
				break;
			case 4:
				System.out.println("The End");
				System.exit(1);
				break;
			default :
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			Thread.sleep(3000);
		}
		
	}
	
		public static void insertBook(Book[] book)
		{
			System.out.print("책의 번호를 입력하세요");
			int no = sc.nextInt();
			sc.nextLine();
			if(no <1||no>book.length)
			{
				System.out.println("번호 범위에서 벗어났습니다.");
				return;
			}
			System.out.print("책의 제목을 입력하세요");
			String title = sc.nextLine();
			System.out.print("책의 평점을 입력하세요");
			int score = sc.nextInt();
			sc.nextLine();
			if(score <0||score>10)
			{
				System.out.println("평점은 0이상 10이하의 정수입니다.");
				return;
			}
			System.out.println("책이 등록되었습니다.");
			book[no-1] = new Book(no,title,score);
		}
		
		public static void findBook(Book[] book)
		{
			System.out.print("찾으시는 책의 이름은?");
			boolean isBookThere = false;
			String title = sc.nextLine();
			for(int i = 0;i<book.length;i++)
			{
				if(book[i] !=null && book[i].getTitle().equals(title))
				{
					System.out.println(book[i]);
					isBookThere = true;
					break;
				}
						
			}
			if(isBookThere == false)
			{
				System.out.println("책이 없었습니다.");
			}		
		}
		
		public static void showBook(Book[] book)
		{
			for(int i = 0;i<book.length;i++)
			{
				if(book[i] != null)
					System.out.println(book[i]);
			}
		}
}
