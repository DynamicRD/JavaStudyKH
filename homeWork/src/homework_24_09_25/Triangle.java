package homework_24_09_25;

public class Triangle extends Shape {
	private double area;
	private double perimeter;
	
	public Triangle(int x, int y, int length, int height, double area, double perimeter) {
		super(x, y, length, height);
		this.area = area;
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		area = this.getLength()*3;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter() {
		perimeter = this.getLength()*this.getHeight()/2.0;
	}

	@Override
	public String toString() {
		return "Triangle [area=" + area + ", perimeter=" + perimeter + "]";
	}

}
