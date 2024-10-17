package chapter2;

public class TypeConversion {

	public static void main(String[] args) {
		int i = 0;
		double f = 0.0;
		
		f = 1/5;
		System.out.println(f);
		f = (double)1 / 5;
		System.out.println(f);
		i = (int)1.7 + (int)1.8;
		System.out.println(i);
	}

}
