package chapter3;

import java.util.Scanner;

public class ScoreAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0,sum = 0,count = 0;
		
		for(;;)
		{
			System.out.print("점수를 입력하시오: ");
			num = sc.nextInt();
			if(num < 0)
			{
				break;
			}
			sum += num;
			count++;
		}
		
		if(count != 0)
		{
			System.out.println("평균은 "+sum/count);
		}else
		{
			System.out.println("점수가 입력되지않았습니다");
			
		}
		
		
		
		
	}

}
