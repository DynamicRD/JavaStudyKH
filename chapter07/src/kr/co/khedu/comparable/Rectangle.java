package kr.co.khedu.comparable;

public class Rectangle implements Comparable {
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public int calArea() {
		return width*height;
	}
	
	@Override
	public int compareTo(Object obj) {
		Rectangle r =null;
		if(!(obj instanceof Rectangle))
		{
			System.exit(1);
		}
			r = (Rectangle)obj;
			
		return calArea()-r.calArea();
	}

}
