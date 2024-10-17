package kr.co.khedu.student;

public class Student extends Object implements Comparable<Student>{
	private int no;
	private String name;
	private int score;
	//----------------
	public Student() {
		this(0,null,0);
	}
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	//----------------
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
	//------------------------------
	@Override
	public String toString() {
		return "Studnet [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		return no;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
		{
			return false;
		}
		Student stu = (Student)obj;
		return no == stu.no;
	}
	@Override
	public int compareTo(Student o) {
		return no - o.no;
	}
	
	
}
