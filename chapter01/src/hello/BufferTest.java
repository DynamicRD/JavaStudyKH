package hello;

import java.util.Scanner;

public class BufferTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		
		str = scanner.next();
		System.out.println(str);
		
		while(str != null)
		{
			str = scanner.next();
			System.out.println(str);
		}
		
		
		
		
	}

}
