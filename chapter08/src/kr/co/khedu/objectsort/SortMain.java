package kr.co.khedu.objectsort;

import java.util.Arrays;
import java.util.Collections;

public class SortMain {

	public static void main(String[] args) {
		Student[] stu = {new Student(1,"zzz",90),
				new Student(2,"bbb",190),
				new Student(3,"ccc",70),
				new Student(4,"ddd",200),
				new Student(0,"eee",250)};
		
		printArray(stu);
		System.out.println("===============");		
		Arrays.sort(stu);
		printArray(stu);
		System.out.println("===============");	
		Arrays.sort(stu,Collections.reverseOrder());
		printArray(stu);
	}

	private static void printArray(Student[] stu) {
		for(Student data : stu)
		{
			System.out.println(data.toString());
		}
	}

}
