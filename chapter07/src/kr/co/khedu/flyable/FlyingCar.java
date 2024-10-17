package kr.co.khedu.flyable;

public class FlyingCar extends Car implements Flyable {
	private int price;
	
	
	public FlyingCar(int speed,int price) {
		super(speed);
		this.price=price;
		System.out.println("FlyingCar 생성자");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("FlyingCar 다형성구현");
	}

}
