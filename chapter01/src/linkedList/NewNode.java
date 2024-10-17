package linkedList;

public class NewNode {
	public static void NewNodeNode(int data,Node node) {
		node.value = data;
		node.next = null;
		node.prev = null;
		if (MainDoubleLinkedList.head == null)
		{
			MainDoubleLinkedList.head = node;
			MainDoubleLinkedList.tail = node;
			return;
		}
		MainDoubleLinkedList.head.prev = node;
		node.next = MainDoubleLinkedList.head;
		MainDoubleLinkedList.head = node;
	}
}
