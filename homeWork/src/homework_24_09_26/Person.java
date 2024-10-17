package homework_24_09_26;

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

	public int compareTo(Object obj) {
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}

	@Override
	public Person getMaximum(Person[] array) {
		return null;
	}

}
