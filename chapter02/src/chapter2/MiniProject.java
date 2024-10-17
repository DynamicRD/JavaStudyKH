package chapter2;
//사용자로부터 섭씨온도를 받아서 화씨온도로 출력한다.
//
import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = 0.0;
		double celsius  = 0.0;
		System.out.print("섭씨온도를 입력하시오: ");
		celsius = sc.nextDouble();
		fahrenheit = celsius*9.0/5.0 + 32.0; 
		System.out.print("섭씨 "+celsius+"도는 화씨 "+fahrenheit+"도 입니다.");
	System.exit(0);
	}

}
