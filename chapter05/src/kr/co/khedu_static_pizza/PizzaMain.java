package kr.co.khedu_static_pizza;

public class PizzaMain {

	public static void main(String[] args) {
		//Pizza 객체를 만들지 않고도 공동멤버변수와 공동멤버함수를 사용할 수 있다.
		System.out.println(Pizza.count);
		Pizza.sPrintMember();
		
		Pizza pizza = new Pizza(20, "콤비네이션");
		Pizza pizza1 = new Pizza(20, "콤비네이션");
		Pizza pizza2 = new Pizza(20, "콤비네이션");
		Pizza pizza3 = new Pizza(20, "콤비네이션");
		Pizza pizza4 = new Pizza(20, "콤비네이션");
		Pizza pizza5 = new Pizza(20, "콤비네이션");
		
		System.out.println(Pizza.count
				);
		
	}

}
