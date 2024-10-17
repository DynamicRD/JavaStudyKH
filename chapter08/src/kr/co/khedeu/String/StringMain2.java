package kr.co.khedeu.String;

public class StringMain2 {
	public static void main(String[] args) {
		String data = "The cat is on the table";
		
		System.out.println(data.indexOf("table"));
		
		String[] dataArray = data.split(" ");
		for(String num:dataArray)
		{
			System.out.println(num);
		}
	}

}
