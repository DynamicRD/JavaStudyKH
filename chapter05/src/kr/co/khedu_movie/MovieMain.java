package kr.co.khedu_movie;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = null,str2 =null;
		Movie[] movie = new Movie[3];
		
		for(int i = 0;i<movie.length;i++)
		{
			System.out.print("영화 제목을 입력하세요: ");
			str1 = sc.nextLine();
			System.out.print("영화 감독을 입력하세요: ");
			str2 = sc.nextLine();
			movie[i] = new Movie(str1,str2);
		}
		for(int i = 0;i<movie.length;i++)
		{
			movie[i].information();
		}
		
		
			
	}

}
