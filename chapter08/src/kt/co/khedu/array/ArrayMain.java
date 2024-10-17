package kt.co.khedu.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMain {

	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//1차원 정수형 10 사이즈 배열
		int[] array = new int[10];
		System.out.println(System.identityHashCode(array));
		//배열에 랜덤값을 등록하기
		insertArray(array);
		//배열의 내용을 출력한다.
		printArray(array);
		//배열을 정렬
		System.out.println();
		Arrays.sort(array);
		printArray(array);
		//배열에 8이라는 숫자를 채우기
		Arrays.fill(array, 8);
		System.out.println();
		printArray(array);
		//배열을 역정렬
		//Arrays.sort(array,Collections.reverseOrder());
		//이건 String 타입일때
		//정렬을 하고싶은데 잘 안된다. ArrayList 만들면된다.
		//Integer[] temp = Arrays.stream(array).boxed().toArray(Integer[]::new);
		//Arrays.sort(temp,Collections.reverseOrder());
		//System.out.println();
		//printArray2(temp);
		//======================
		Integer[] array2 = {1,4,6,7,3,5,2,7,10,5};
		Arrays.sort(array2,Collections.reverseOrder());
		printArray(array2);
		//======================
		
	}

	private static void printArray(int[] array) {
		for(int num:array)
		{
			System.out.print(num+" ");
		}
	}
	private static void printArray3(List<Integer> array) {
		for(int num:array)
		{
			System.out.print(num+" ");
		}
	}
	private static void printArray(Integer[] array) {
		for(int num:array)
		{
			System.out.print(num+" ");
		}
	}

	private static void insertArray(int[] array) {
		for(int i = 0;i<array.length;i++)
		{
			array[i] = (int)(Math.random()*10+1);
			System.out.println(array[i]);
		}
	}

}
