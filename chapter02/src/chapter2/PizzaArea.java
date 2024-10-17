package chapter2;

import java.util.Scanner;

//작은 피자 2판과 큰 피자 1판을 선택했을때 어떤 부분이 선택을 잘 했는지
//비교하는 프로그램을 만들어본다
//조건: 가격이 같다고 생각했을때,면적: 3.141592 * (반지름)^2

public class PizzaArea {

	public static void main(String[] args) {
		// 1.변수,상수
		final double PI = 3.141592;	//상수
		int smallSize =0,largeSize = 0;
		double smallArea = 0.0,largeArea = 0.0;		
		// 2.계산처리
		Scanner sc = new Scanner(System.in);
		System.out.print("input smallSize :");
		smallSize = sc.nextInt();
		System.out.print("input largeSize :");
		largeSize = sc.nextInt();
		//면적처리
		smallArea = PI * smallSize * smallSize;
		largeArea = PI * largeSize * largeSize;
		//비교처리
		String resultValue = (smallArea*2 > largeArea) ? 
								"작은사이즈 선택" : "큰사이즈 선택";
		
		
		// 3.출력
		System.out.println("고객님 "+resultValue+"하는것이 현명합니다.");
		
		// 4.종료
		System.exit(0);
	}

}
