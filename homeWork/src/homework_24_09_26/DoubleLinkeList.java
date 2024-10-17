package homework_24_09_26;

import java.util.Scanner;

public class DoubleLinkeList {


	public static Scanner sc = new Scanner(System.in);
	public static Node head;
	public static Node tail;
	public static final int ADD_FIRST_NODE = 1,ADD_REAR_NODE =2,REMOVE_FIRST_NODE =3,
			REMOVE_REAR_NODE =4,TRAVEL_NODE=5,FIND_NODE=6,EXIT =7;
//---------------------------------------------------------
	public static void main(String[] args) {
		boolean exitFlag = false;
		int choice = 0;
		
		for(;!exitFlag;)
		{
			menu();
			choice = sc.nextInt();
			sc.nextLine();
				
			switch(choice)
			{
			case ADD_FIRST_NODE:
				addFirstNode();
				break;
			case ADD_REAR_NODE:
				addRearNode();
				break;
			case REMOVE_FIRST_NODE:
				removeFirstNode();
				break;
			case REMOVE_REAR_NODE:
				removeRearNode();
				break;
			case TRAVEL_NODE:
				travelNode();
				break;
			case FIND_NODE:
				findNode();
				break;
			case EXIT:
				System.out.println("프로그램종료");
				System.exit(1);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	//-----------------------------------------------------------
	public static void menu()
	{
		System.out.println("==============================");
		System.out.println("이중연결리스트");
		System.out.println("1.맨앞 노드 추가");
		System.out.println("2.맨뒤 노드 추가");
		System.out.println("3.맨앞 노드 삭제");
		System.out.println("4.맨뒤 노드 삭제");
		System.out.println("5.노드 순회");
		System.out.println("6.노드 검색");
		System.out.println("7.종료");
		System.out.println("==============================");
		System.out.print("번호를 입력하세요");
	}
	//-----------------------------------------------------------
	public static Node newNode()
	{
		Node node = new Node();
		if(head == null)
		{
			head = node;
			tail = node;
		}	
		return node;
	}
	//------------------------------------------------------------
	public static void addFirstNode()
	{
		Node curNode = newNode();
		if(curNode == head)
		{
			System.out.println("노드 생성(첫번째노드)");
			return;
		}
		curNode.setNext(head);
		head.setPrev(curNode);
		head = curNode;
		System.out.println("맨앞 노드 생성");
	}
	//-------------------------------------------------------------
	public static void addRearNode()
	{
		Node curNode = newNode();
		if(curNode == head)
		{
			System.out.println("노드 생성(첫번째노드)");
			return;
		}
		curNode.setPrev(tail);
		tail.setNext(curNode);
		tail = curNode;
		System.out.println("맨앞 노드 생성");
	}
	//-------------------------------------------------------------
	public static void removeFirstNode()
	{
		if(head == null)
		{
			System.out.println("생성된 노드가 없어서 삭제불가능합니다.");
			return;
		}
		Node curNode = head;
		if(head==tail)
		{
			curNode = null;
			head = null;
			tail = null;
			System.out.println("삭제완료.");
			return;
		}
		head = curNode.getNext();
		head.setPrev(null);
		curNode = null;
		System.out.println("삭제완료.");
	}
	//-------------------------------------------------------------
	public static void removeRearNode()
	{
		if(head == null)
		{
			System.out.println("생성된 노드가 없어서 삭제불가능합니다.");
			return;
		}
		Node curNode = tail;
		if(head==tail)
		{
			curNode = null;
			head = null;
			tail = null;
			System.out.println("삭제완료.");
			return;
		}
		tail = curNode.getPrev();
		tail.setNext(null);
		curNode = null;
		System.out.println("삭제완료.");
	}
	//-----------------------------------------------------
	public static void travelNode()
	{
		if(head == null)
		{
			System.out.println("생성된 노드가 없어서 출력 불가능합니다.");
			return;
		}
		Node curNode = head;
		System.out.print("이중연결리스트: "+curNode.getValue());
		while(curNode.getNext() != null)
		{
			curNode = curNode.getNext();
			System.out.print("->"+curNode.getValue());
		}
		System.out.println();
	}
	//-------------------------------------------------------
	public static void findNode()
	{
		if(head == null)
		{
			System.out.println("해당 노드는 존재하지 않습니다.");
			return;
		}
		System.out.print("찾을 값을 선택하세요.");
		int value = sc.nextInt();
		sc.nextLine();
		Node curNode = head;
		
		if(curNode.getValue() == value)
		{
			System.out.println("해당 값은 존재합니다.");
			return;
		}
		while(curNode.getNext() != null)
		{
			curNode = curNode.getNext();
			if(curNode.getValue() == value)
			{
				System.out.println("해당 값은 존재합니다.");
				return;
			}
		}
		System.out.println("해당 값은 존재하지 않습니다.");
	}
}
