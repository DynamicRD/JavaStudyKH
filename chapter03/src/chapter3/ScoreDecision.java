package chapter3;

import java.util.Scanner;

public class ScoreDecision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String rank = null;
		
		System.out.print("성적을 입력하시오: ");
		score = sc.nextInt();
		
		if(score >= 90 && score <= 100)
		{
			System.out.println("학점 A");
		}else if(score >= 80 && score < 90)
		{
			System.out.println("학점 B");			
		}else if(score >= 70 && score < 80)
		{
			System.out.println("학점 C");						
		}else
		{
			System.out.println("학점 F");									
		}
		
		
		sc.close();
		System.exit(1);
	}

}
