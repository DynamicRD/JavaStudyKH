package homework_24_10_08;

public class PracticeMain {

	public static void main(String[] args) {
            sub();
      }
	
      public static void sub() {
             int[] array = new int[10];
             try {
             int i = array[10];
             }catch(ArrayIndexOutOfBoundsException e) {
            	 System.out.println("ArrayIndexOutOfBoundsException");
             }
             
      }

	   
	}
	


