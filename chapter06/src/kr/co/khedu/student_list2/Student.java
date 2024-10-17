package kr.co.khedu.student_list2;

public class Student {
		public static final int SUBJECT_NUM = 3; 
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		private double avr;
		public Student() {		}
		public Student(int no, String name, int kor, int eng, int math) {
			this.no = no;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
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
		public void setMath(int math) {
			this.math = math;
		}
		public int getSum() {
			return sum;
		}
		public void setSum() {
			sum = kor +math+eng;
		}
		public double getAvr() {
			return avr;
		}
		public void setAvr() {
			avr = getSum() / (double)SUBJECT_NUM;
		}
		
		
		
		
		
}
