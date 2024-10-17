package kr.co.khedu.student_list;

public class Student implements Comparable<Student> {
	public static final int NUM_SUB = 3;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avr;
	
	public Student() {
		this(0,null, 0,0, 0);
	}

	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public void setSum() {
		sum = kor + eng + math;
	}

	
	
	
	public void setAvr() {
		avr = (kor + eng + math)/(double)NUM_SUB;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "[" + no + "," + name + "," + kor + "," + eng + "," + math + ","
				+ sum + "," + avr + "]";
	}

	@Override
	public int compareTo(Student stu) {
		return stu.getSum() - this.sum;
	}


	
}
