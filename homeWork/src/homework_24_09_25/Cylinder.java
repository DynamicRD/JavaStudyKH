package homework_24_09_25;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius, String color) {
		super(radius, color);
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume()
	{
		return this.area()*height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getHeight()=" + getHeight() + ", getVolume()=" + getVolume()
				+ ", getRadius()=" + getRadius() + ", getColor()=" + getColor() + ", toString()=" + super.toString()
				+ ", area()=" + area() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

