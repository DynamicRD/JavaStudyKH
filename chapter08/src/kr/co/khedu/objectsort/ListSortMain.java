package kr.co.khedu.objectsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortMain {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"zzz",90));
		list.add(new Student(2,"bbb",190));
		list.add(new Student(3,"ccc",70));
		list.add(new Student(4,"ddd",200));
		list.add(new Student(0,"eee",250));
		
	//배열을 List로 변경
	//List<Student> list = Arrays.asList(array);
		printArray(list);
		System.out.println("===============");
		Collections.sort(list);
		printArray(list);
		System.out.println("===============");
		Collections.reverse(list);
		printArray(list);
	}

	private static void printArray(ArrayList<Student> list) {
		for(Student data : list)
		{
			System.out.println(data.toString());
		}
	}

}
