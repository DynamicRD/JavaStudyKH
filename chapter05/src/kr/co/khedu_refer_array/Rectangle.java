package kr.co.khedu_refer_array;

public class Rectangle {
	private int hight;
	private int width;
	public Rectangle(int hight, int width) {
		this.hight = hight;
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "ReferArray [hight=" + hight + ", width=" + width + "]";
	}
	//연산자 함수
	public int getArea() {	
		return hight*width;
	}
	
	
}
