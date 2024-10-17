package linkedList;

import java.util.Scanner;

public class MainDoubleLinkedList {

	static Node head = new Node();
	static Node tail = new Node();
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		head = null;
     	tail = null;
		int choice=0,data=0;
		
		
		while(true)
		{
			System.out.println("-----이중연결리스트-----");
			System.out.println("1.앞노드 추가");
			System.out.println("2.뒷노드 추가");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("정수값을 입력하세요: ");
				data = scanner.nextInt();
				Node node = new Node();
				NewNode.NewNodeNode(data, node);
				break;
			case 2:
				System.out.print("정수값을 입력하세요: ");
				data = scanner.nextInt();
				//Node node = new Node();
				//NewNode.NewNodeNode(data, node);
				break;
			case 10:
				System.exit(0);
				break;
			}
			Pause.waitForAnyKey();
			Cls.clearConsole();
		}
		
	}

}
