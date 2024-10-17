package chapter3;

import java.util.Scanner;

public class StarDotRibborn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.print("몇줄짜리 별을 찍습니까? ");				
		num = sc.nextInt();		
		
		for(int i = 0;i< num;i++)
		{
			for(int j = 0;j<num;j++)
			{
				if((j <= i || j >= num-i-1)&& num/2 >i){
				System.out.print("*");
				}else if((j >= i || j <= num-i-1)&& num/2 <i){
				System.out.print("*");
				}
				else if(i == num/2) {
					System.out.print("*");
				}	
				else {
				System.out.print(" ");			
				}
			}
			System.out.println("");
		}
	}

}
