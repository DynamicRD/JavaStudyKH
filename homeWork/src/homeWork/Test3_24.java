package homeWork;

import java.util.Scanner;

public class Test3_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, c = 0;     
		int num = 0;
		System.out.print("몇 번째 항까지 출력할것인가? ");
     	num = sc.nextInt();

     for(int i = 2; i <= num;i++)
     {
        c = a + b;// 변수 a와 b를 더하여 변수 c에 대입한다.
        a = b;// 변수 b의 값을 변수 a로 옮긴다. 
        b = c;// 변수 c의 값을 변수 b로 옮긴다. 
     }
	System.out.println(b);


	}

}
