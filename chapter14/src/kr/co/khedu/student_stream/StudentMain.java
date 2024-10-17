package kr.co.khedu.student_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1111,"kdj",90));
		list.add(new Student(1234,"lee",80));
		list.add(new Student(4444,"bark",100));
		list.add(new Student(5555,"la",30));
		list.add(new Student(3333,"gu",40));
		
//		Stream<Student> stream =list.stream();
//		Stream<Student> stream2 = stream.filter(stu->stu.getScore() >= 60);
//		Stream<Student> stream3 = stream2.sorted((o1, o2)-> o1.getNo()-o2.getNo());
//		Stream<Integer> stream4 = stream.map(t->t.getNo());
//		List<Integer> list2 =stream4.collect(Collectors.toList());

		List<Integer> list2 =list.stream().filter(stu->stu.getScore() >= 60).sorted((o1, o2)-> o1.getNo()-o2.getNo()).map(t->t.getNo()).collect(Collectors.toList());

		for(Integer data : list2) {
			System.out.print(data+"\t");
		}
	}
}
