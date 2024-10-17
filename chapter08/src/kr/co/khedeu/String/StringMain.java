package kr.co.khedeu.String;

public class StringMain {

	public static void main(String[] args) {
		String data1 = "abcdefg";
		char value = data1.charAt(data1.length()-1);
		System.out.println(value);

		String data2 = "abcdefh";
		System.out.println(data1.compareTo(data2));
		System.out.println(data1.equals(data2));
		
		String data3 = data1.concat(data2);	//잘 안씀,근데 속도개선
		String data4 = data1 + data2;	//이거 더 편함
		System.out.println(data3);
		
		System.out.println(data1.isEmpty());
		System.out.println(data1.toUpperCase());
		System.out.println(data1.toLowerCase());
	}

}
