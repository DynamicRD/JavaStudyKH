package chapter3;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		int num = 0,count = 0,answer = 0;
		num = (int)(Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("정답을 추측하여 보시오: ");
			answer = sc.nextInt();
			count++;
			if(answer == num)
			{
				System.out.println("축하합니다. 시도횟수="+count);
				break;
			}
			System.out.println((answer>num) ? ("제시한 정수가 높습니다") :("제시한 정수가 낮습니다"));
			
			
			
		}
		
	}

}
