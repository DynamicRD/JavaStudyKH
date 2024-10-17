package homework_24_09_26;

public class Rectangle implements GraphicsObject {
	private int length;
	private int width;
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getArea() {
		return length*width;
	}

	@Override
	public void draw() {
		System.out.println("그림을 그립니다.");
	}
	
	public void setDimensions (int l, int w)
	{
		length = l;
		width = w;
	}
}
