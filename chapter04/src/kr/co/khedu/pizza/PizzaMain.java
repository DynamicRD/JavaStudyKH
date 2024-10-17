package kr.co.khedu.pizza;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setSize(5);
		pizza.setName("포테이토");
		pizza.setPrice(20000);
		boolean rValue = pizza.getDelivery("왕십리 100번지");
		if(rValue == true) {
			System.out.println("배달가능");
		}else
		{
			System.out.println("배달 불가");
		}
		
		rValue = pizza.DiscountRate();
		
		if(rValue == true) {
			System.out.println("할인이 적용됨, 금액"+pizza.getPrice());
		}else
		{
			System.out.println("할인 미적용");
		}
		
		System.out.println(pizza.toString());
		
	}

}
