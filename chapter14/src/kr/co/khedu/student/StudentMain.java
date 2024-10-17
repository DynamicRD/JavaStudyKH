package kr.co.khedu.student;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		List<Student> list2 = new ArrayList<>();
		
		list.add(new Student(1,"김두한",99));
		list.add(new Student(2,"김무옥",66));
		list.add(new Student(3,"김영철",77));
		list.add(new Student(4,"개코",88));
		list.add(new Student(5,"정진영",55));
		
		//1단계
//		MyStudentPredicate msp = new MyStudentPredicate();
//		for(Student data: list)
//		{
//			if(msp.test(data))
//			{
//				list2.add(data);
//			}
//		}
//		for(Student data: list2)
//		{
//			System.out.println(data.toString());
//		}
		
		//2단계 임시객체
//		StudentPredicate sp= new StudentPredicate() {
//			
//			@Override
//			public boolean test(Student student) {
//				return student.getScore() >= 80;
//			}
//		};		
//		list2=filterStudent(list, sp);
//		for(Student data: list2)
//			{
//				System.out.println(data.toString());
//			}
//		}
		
		//3단계 임시객체 매개변수
		/*list2=filterStudent(list, new StudentPredicate() {
			
			@Override
			public boolean test(Student student) {
				return student.getScore() >= 80;
			}
			});
		for(Student data: list2)
		{
			System.out.println(data.toString());
		}
	}*/
		
		//4단계 람다식
		list2=filterStudent(list,student->student.getScore() >= 80);
		for(Student data: list2)
		{
			System.out.println(data.toString());
		}
		}
	
	
	
	private static List<Student> filterStudent(List<Student> list,StudentPredicate sp) {
		List<Student> list2 = new ArrayList<>();
		for(Student data :list) {
			if(sp.test(data)){
				list2.add(data);
			}
		}
		return list2;
	}
}
