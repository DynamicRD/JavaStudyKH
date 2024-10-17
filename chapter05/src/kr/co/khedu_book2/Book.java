package kr.co.khedu_book2;

public class Book {
	private int no;
	private String title;
	private int score;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Book(int no, String title, int score) {
		this.no = no;
		this.title = title;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", score=" + score + "]";
	}
}
