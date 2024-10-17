package chapter2;






import java.util.Scanner;

public class InformationInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		
		System.out.print("이름을 입력하시오: ");
		name = scanner.nextLine();
		System.out.print("나이를 입력하시오: ");
		age = scanner.nextInt();
		
		System.out.print(""+name+"님 안녕하세요! "+age+"살이시네요");

	}

}
