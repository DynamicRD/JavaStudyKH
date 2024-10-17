package classPractice;

public class Rectangle {
		private double w;
		private double h;
		public double getW() {
			return w;
		}
		public void setW(double w) {
			this.w = w;
		}
		public double getH() {
			return h;
		}
		public void setH(double h) {
			this.h = h;
		}
		
		public double area()
		{
			return w*h;
		}
		
		public double perimeter()
		{
			return 2*w+2*h;
		}
		
}
