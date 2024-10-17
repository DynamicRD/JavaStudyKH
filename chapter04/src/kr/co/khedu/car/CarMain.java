package kr.co.khedu.car;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("빨간색");
		car.setSpeed(100);
		car.setGear(4);
		
		car.speedUp();
		car.speedUp();
		car.gearChange(5);
		System.out.println(car.toString());

		Car car2 = new Car("검정색", 200);
		System.out.println(car2.toString());
		
		car2.speedDown();
		car2.speedDown();
		car2.speedDown();
		car2.gearChange(4);
		System.out.println(car2.toString());
	}

}
