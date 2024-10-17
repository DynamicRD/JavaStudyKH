package kr.co.khedu.student;

public class Student {
	private int no;
	private String name;
	private int korScore;
	private int engScore;
	private int mthScore;
	private int total;
	private double average;
	
	public Student() {
		this(0,null,0,0,0);
	}

	public Student(int no, String name, int korScore, int engScore, int mthScore) {
		this.no = no;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mthScore = mthScore;
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

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMthScore() {
		return mthScore;
	}

	public void setMthScore(int mthScore) {
		this.mthScore = mthScore;
	}

	public int getTotal() {
		return total;
	}

	public int setTotal() {
		total = korScore+mthScore+engScore;
		return total;
	}
	
	public double getAverage() {
		return average;
	}

	public void setAverage() {
		average = setTotal()/3.0;
	}
	
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + ", KorScore=" + korScore + ", EngScore=" + engScore
				+ ", MthScore=" + mthScore + ", total=" + total + ", average=" + average + "]";
	}

	
	

}
