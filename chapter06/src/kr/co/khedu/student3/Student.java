package kr.co.khedu.student3;

import java.util.Objects;

public class Student implements Cloneable{
		public final int SUBJECT_COUNT = 3;
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		private double avr;
		
		public Student(int no, String name, int kor, int eng, int math) {
			super();
			this.no = no;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			setSum();
			setAvr();
			System.out.println("학생추가완료");
		}

		public Student() {
			this(0,null,0,0,0);
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
			sum = (kor+eng+math) ;
		}

		public double getAvr() {
			return avr;
		}

		public void setAvr() {
			avr = getSum()/(double)SUBJECT_COUNT;
		}

		@Override
		public String toString() {
			return "" + no + "," + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
					+ ", sum=" + sum + ", avr=" + avr + "";
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(no,name);
		}

		@Override
		public boolean equals(Object obj) {
			Student stu = null;
			if(!(obj instanceof Student))
			{
				System.out.println("객체 비교불가");
				return false;
			}
			
			stu =(Student)obj;
			if(no==stu.no&&name.equals(stu.name)) {
				return true;
			}
			return false;
		}
		//@Override
		//public int compareToo(Student stu) {
		//	return getSum() - this.getSum();
		//}		

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return (Student)super.clone();
		}
		
		
}
