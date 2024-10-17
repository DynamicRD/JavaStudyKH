package chapter3;

import java.util.Scanner;

public class ScoreDecision2 {

	public static void main(String[] args) {
		int data = 0;
		String scoreGrade = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시험성적 입력: ");
		data = sc.nextInt();
		
		if(data >100 || data<0)
		{
			System.out.println("성적 오류");
			System.out.println("The End");
			System.exit(1);
		}
		
		
		if(data >= 95)
		{
			scoreGrade = "A+학점";
		}else if(data >=90)
		{			
			scoreGrade = "A학점";
		}else if(data >=85)
		{			
			scoreGrade = "B+학점";
		}else if(data >=80)
		{			
			scoreGrade = "B학점";
		}else if(data >=75)
		{			
			scoreGrade = "C+학점";
		}else if(data >=70)
		{			
			scoreGrade = "C학점";
		}else
		{
			scoreGrade = "F학점";
		}
		
		System.out.println("성적은 "+scoreGrade+"입니다");
		System.out.println("The End");
		sc.close();
		System.exit(1);	
	}

}
