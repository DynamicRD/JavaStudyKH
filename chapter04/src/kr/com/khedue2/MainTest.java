package kr.com.khedue2;

import java.util.Scanner;

public class MainTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String choice = null;
		
		System.out.print("어떤 사각형의 넓이를 구하나요");
		choice = sc.nextLine();
		
		switch(choice)
		{
		case "정사각형":
			
			System.out.println("사각형의 넓이는 "+InputRightSquare().Right());
			break;
		case "직사각형":	
			System.out.println("사각형의 넓이는 "+Input().Jik());
			break;
		case "마름모":
			System.out.println("사각형의 넓이는 "+Input().Diamond());
			break;
		case "평행사변형":
			System.out.println("사각형의 넓이는 "+Input().Jik());
			break;
		case "사다리꼴":
			System.out.println("사각형의 넓이는 "+InputLadder().Ladder());
			break;
		default:
			System.out.println("오류입니다");
			System.exit(1);
		}
	
	}


public static Square Input()
{	
	System.out.print("사각형의 가로는? ");
	double length = sc.nextDouble();
	System.out.print("사각형의 세로는? ");
	double width = sc.nextDouble();
	Square square = new Square(length,width);
	System.out.print("가로 세로의 길이는 각각 "+square.getLength()+", "+square.getWidth());
	return square;
}

public static Square InputRightSquare()
{	
	System.out.print("사각형의 한변의 길이는? ");
	double length = sc.nextDouble();
	Square square = new Square(length);
	System.out.print("한변의 길이는 "+square.getLength());
	return square;
}

public static Square InputLadder()
{	
	System.out.print("사각형의 밑변의 길이는? ");
	double length = sc.nextDouble();
	System.out.print("사각형의 윗변의 길이는? ");
	double upperlength = sc.nextDouble();
	System.out.print("사각형의 세로는? ");
	double width = sc.nextDouble();
	Square square = new Square(length,width,upperlength);
	System.out.print("윗면 밑면 높이는 각각 "+square.getUpperlength()+", "+square.getLength()+", "+square.getWidth());
	return square;
}

}


