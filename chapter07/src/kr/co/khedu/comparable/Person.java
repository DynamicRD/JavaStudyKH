package kr.co.khedu.comparable;

public class Person implements Comparable {
	private String name;
	private int height;
	
	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Object obj) {
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}

}
