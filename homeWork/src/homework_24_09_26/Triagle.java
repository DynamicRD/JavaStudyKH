package homework_24_09_26;

public class Triagle implements Movable {
	private int width;
	private int height;
	private int x;
	private int y;
	
	public Triagle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Triagle [width=" + width + ", height=" + height + "]";
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
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		x=dx;
		y=dy;
	}

}
