package chapter2;

public class FowardBackward {

	public static void main(String[] args) {
		int x=1,y=1,z=0, k=0;
		k = x+1;
		z = x++ + y++ + k;
		
		System.out.println(x+" "+y+" "+z);
	}

}
