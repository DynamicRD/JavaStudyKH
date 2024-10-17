package homeWork_24_09_20;

public class Box {
	private double width;
	private double length;
	private double height;
	private boolean empty;
	public Box() {}
	public Box(double width, double length, double height, boolean empty) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
		this.empty = empty;
	}
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
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", empty=" + empty + "]";
	}
	
}
