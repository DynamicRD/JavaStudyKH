package homeWork;

import java.util.Scanner;

public class Test4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] h2b = {"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"
	             	};
		for (int i = 0;i<16;i++)
		{
			System.out.println("h2b["+i+"] = "+h2b[i]);
		}
		System.out.println("값을 입력해라");
		String data = sc.nextLine();
		//int num = (int)data.charAt(0) - 48;//48 == '0'
		for(int i = 0;i<4;i++)
		{
			char value = data.charAt(i);
			int num = 0;
			if(value>='0' &&value<='9')
			{
				num = value - '0';
			}else if(value>='a' &&value<='f')
			{	
				num = value - 'a' + 10;
			}
			System.out.println(h2b[num]+" ");
			
		}
		
					}

}
