package kr.com.khedue2;


public class Square {
	private double length;
	private double width;
	private double upperlength;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getUpperlength() {
		return upperlength;
	}

	public void setUpperlength(double upperlength) {
		this.upperlength = upperlength;
	}

	public Square(double length)
	{
		this.length = length;
	}
	
	public Square(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public Square(double length,double width,double upperwidth)
	{
		this.length = length;
		this.width = width;
		this.upperlength = width;
	}
	
	public double Right()
	{
		double area = Math.pow(length, 2);
		return area;
	}
	
	public double Jik()
	{
		double area = length*width;
		return area;
	}
	
	public double Diamond()
	{
		double area = length*width/2.0;
		return area;
	}
	
	public double Ladder()
	{
		double area = (length+upperlength)*width/2;
		return area;
	}
	
	
}
