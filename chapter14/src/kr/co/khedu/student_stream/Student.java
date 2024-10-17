package kr.co.khedu.student_stream;

public class Student implements Comparable<Student>{
	private int no;			//primary key(주키 기본키 슈퍼키)
	private String name;
	private int score;
	
	public Student() {
		this(0,null,0);
	}
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	//-------------------------------
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//-------------------------------
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		return no;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			return false;
		}
		Student std = (Student)obj;
		return no == std.no;
	}
	@Override
	public int compareTo(Student o) {
		return no - o.no;
	}
	

}
