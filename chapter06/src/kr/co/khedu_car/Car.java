package kr.co.khedu_car;

public class Car /*extends Object*/{
		private int speed;

		public Car(int speed) {
			super();
			System.out.println("Car객체 생성.");
			this.speed = speed;
		}

		public Car() {
			super();
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		@Override
		public String toString() {
			return "Car [speed=" + speed + "]";
		}
		
		
}
