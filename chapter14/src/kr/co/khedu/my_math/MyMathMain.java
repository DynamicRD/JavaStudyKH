package kr.co.khedu.my_math;

public class MyMathMain {

	public static void main(String[] args) {
		//1단계 구현클래스를 설계해서 객체로 만들기
		MineMath mm = new MineMath();
		int value = mm.calculate(20);
		System.out.println(value);
		
		//2단계 구현클래스를 만들지 않고 인터페이스 사용 ->임시객체
		//구현클래스 구현참조변수 = new 구현인터페이스();
		MyMath mm2 = new MyMath() {
			@Override
			public int calculate(int x) {
				return x*x;
			}
		};
		int value2 = mm.calculate(20);
		System.out.println(value2);
		
		//3단계 구현클래스가 매개변수
		int value3 = new MyMath() {
			
			@Override
			public int calculate(int x) {
				return x*x;
			}
		}.calculate(20);
		System.out.println(value3);
		
		//4단계 람다식
		MyMath mm4 = x->x*x*x*x;
		int value4 = mm4.calculate(20);
		System.out.println(value4);
		
	}

}
