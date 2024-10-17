package kr.co.khedu.student;

public class MyStudentPredicate implements StudentPredicate {
	@Override
	public boolean test(Student student) {
		return student.getScore() >= 80;
	}
	
}
