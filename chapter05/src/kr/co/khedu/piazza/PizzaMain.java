package kr.co.khedu.piazza;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(15);
		Pizza p2 = new Pizza(20);
		
		System.out.println("두개 피자중에 어느것이 크냐");
		Pizza largePizza = Pizza.WhosLargest(p1, p2);
		System.out.println(largePizza.getRadius());
		
	}

}
