package homeWork_24_09_20;

public class Circle {
	private double r;
	private double cx;
	private double cy;
	public Circle(double r, double cx, double cy) {
		this.r = r;
		this.cx = cx;
		this.cy = cy;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getCx() {
		return cx;
	}
	public void setCx(double cx) {
		this.cx = cx;
	}
	public double getCy() {
		return cy;
	}
	public void setCy(double cy) {
		this.cy = cy;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", cx=" + cx + ", cy=" + cy + "]";
	}
	
	public double area()
	{
		return r*r*3.141592;
	}
	
}
