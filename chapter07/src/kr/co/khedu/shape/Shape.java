package kr.co.khedu.shape;

public abstract class Shape {
		//멤버변수
		private int x;
		private int y;
		//생성자

		public Shape(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			System.out.println("Shape생성자로 객체생성");
		}
		
		//겟셋터
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		//연산함수
		public abstract void draw();
		//toString
		@Override
		public String toString() {
			return "Shape [x=" + x + ", y=" + y + "]";
		}
		
	
	
		
		
}
