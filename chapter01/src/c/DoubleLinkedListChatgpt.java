package c;
import java.util.Scanner;

class Node {
    Node next;
    Node prev;
    int value;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedListChatgpt {
    private Node head = null;
    private Node tail = null;

    public static void main(String[] args) {
    	DoubleLinkedListChatgpt list = new DoubleLinkedListChatgpt();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----이중연결리스트----");
            System.out.println("1.앞노드 추가.");
            System.out.println("2.뒷노드 추가.");
            System.out.println("3.앞노드 제거.");
            System.out.println("4.뒷노드 제거.");
            System.out.println("5.노드 순회.");
            System.out.println("10. 종료.");
            System.out.print("선택하세요: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("정수를 입력하세요: ");
                    int dataFront = scanner.nextInt();
                    list.addFrontNode(dataFront);
                    break;
                case 2:
                    System.out.print("정수를 입력하세요: ");
                    int dataRear = scanner.nextInt();
                    list.addRearNode(dataRear);
                    break;
                case 3:
                    list.removeFrontNode();
                    break;
                case 4:
                    list.removeRearNode();
                    break;
                case 5:
                    list.nodeTraversal();
                    break;
                case 10:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }

            try {
                Thread.sleep(1000); // 1초 대기
                System.out.print("\033[H\033[2J"); // 콘솔 화면 지우기
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void addFrontNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println("새 노드 추가(첫번째 노드)");
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println("앞노드 추가");
        }
    }

    void addRearNode(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            System.out.println("새 노드 추가(첫번째 노드)");
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            System.out.println("뒷노드 추가");
        }
    }

    void removeFrontNode() {
        if (head == null) {
            System.out.println("삭제할 노드가 없습니다.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("삭제완료");
            return;
        }
        head = head.next;
        head.prev = null;
        System.out.println("삭제완료");
    }

    void removeRearNode() {
        if (tail == null) {
            System.out.println("삭제할 노드가 없습니다.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("삭제완료");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        System.out.println("삭제완료");
    }

    void nodeTraversal() {
        if (head == null) {
            System.out.println("연결리스트가 구성되지않아 출력할수없습니다.");
            return;
        }
        Node curNode = head;
        System.out.print("연결리스트: " + curNode.value);
        while (curNode.next != null) {
            curNode = curNode.next;
            System.out.print(" - " + curNode.value);
        }
        System.out.println();
    }
}
