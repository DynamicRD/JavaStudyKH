package kr.co.khedue.object;

public class ObjectMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu = new Student(1,"홍길동");
		Student stu2 = new Student(1,"홍길도");
		Student stu3 = (Student)stu2.clone();
		//System.out.println(stu.toString());
		
		//System.out.println(stu.equals(stu2));
		
		
		System.out.println(stu.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
	}

}
