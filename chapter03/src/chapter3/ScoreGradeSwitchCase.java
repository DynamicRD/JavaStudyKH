package chapter3;

import java.util.Scanner;

public class ScoreGradeSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data = 0;
		String scoreGrade = null;
		System.out.print("시험성적 입력: ");
		data = scanner.nextInt();
	
		
		
		if(data >10 || data<0)
		{
			System.out.println("성적 오류");
			System.out.println("The End");
			System.exit(1);
		}
		
		switch(data/10)
		{
		case 9: case 10:
			scoreGrade = "A학점";
			break;
		case 8: 
			scoreGrade = "B학점";
			break;
		case 7: 
			scoreGrade = "C학점";
			break;
		case 6: 
			scoreGrade = "D학점";
			break;
		default:
			scoreGrade = "F학점";
			break;		
		}
	
		System.out.println("성적은 "+scoreGrade+"입니다");
		System.out.println("The End");
		
		scanner.close();
		System.exit(1);		
	}

}
