package homework_24_09_26;

public class Node {
	private int value;
	private Node next;
	private Node prev;
	
	public Node() {
		super();
		value = (int)(Math.random()*100+1);
		next = null;
		prev = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + ", prev=" + prev + "]";
	}
	
	
}
