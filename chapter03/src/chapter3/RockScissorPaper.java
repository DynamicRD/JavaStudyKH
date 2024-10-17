package chapter3;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		//랜덤값 추출 1~10
		
		Scanner sc = new Scanner(System.in);
		
		int player = 0,com = 0;
		com = (int)(Math.random()*3);
		
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		player = sc.nextInt();
		
		if(player == com)
		{
			System.out.print("인간: "+player+" 컴퓨터: "+com+" 비김");			
		}else if(player==(com+1)%3)
		{			
			System.out.print("인간: "+player+" 컴퓨터: "+com+" 인간 승리");	//인==(컴+1)%3				
		}else if(player!=(com+1)%3)
		{
			System.out.print("인간: "+player+" 컴퓨터: "+com+" 컴퓨터 승리");	//인!=(컴+!)%3				
		}
	}

}
