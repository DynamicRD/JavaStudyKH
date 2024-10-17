package homework_24_09_25;

public class Shape {
	private int x;
	private int y;
	private int length;
	private int height;
	
	public Shape(int x, int y, int length,int height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height= height;
	}

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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", length=" + length + ", height=" + height + "]";
	}
	
}
