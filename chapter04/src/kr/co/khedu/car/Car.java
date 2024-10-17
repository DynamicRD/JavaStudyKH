package kr.co.khedu.car;

public class Car {
		private String color;
		private int speed;
		private int gear;
		
		public Car() {}
		public Car(String color, int speed) {
			this.color = color;
			this.speed = speed;
			this.gear = 5;
		}
		
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getGear() {
			return gear;
		}
		public void setGear(int gear) {
			this.gear = gear;
		}
		
		//연산함수(기어변경,스피드변경 10씩)
		public void gearChange(int gear)
		{
			if(gear<=0 || gear>5)
			{
				System.out.println("기어는 1단에서 5단까지 있습니다.");
				return;
			}
			this.gear = gear;
			System.out.println("기어가 "+gear+"단으로 설정됐습니다.");
		}
		
		public void speedUp()
		{
			speed += 10;
			if(speed>= 300)
			{
				System.out.println("시속 300 이상은 안됩니다.");
				speed = 300;
				return;
			}
			System.out.println("속도를 10 올렸습니다.");
		}
		
		public void speedDown()
		{
			speed -= 10;
			if(speed<= 0)
			{
				System.out.println("0미만 속도는 안됩니다");
				speed = 0;
				return;
			}
			System.out.println("속도를 10 낮췄습니다.");
		}
	
		
		
		@Override
		public String toString() {
			return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
		}
		
		
		
}
