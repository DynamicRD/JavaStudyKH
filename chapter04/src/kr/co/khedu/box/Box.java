package kr.co.khedu.box;

public class Box {
		private double width;
		private double length;
		private double height;
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double boxVolume()
		{
			return width*length*height;
		}
}
