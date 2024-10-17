package homework_24_09_25;

public class Magazine extends Book {
	private String releaseDate;

	public Magazine(String title, int pages, String author, String releaseDate) {
		super(title, pages, author);
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Magazine [releaseDate=" + releaseDate + ", getTitle()=" + getTitle() + ", getPages()=" + getPages()
				+ ", getAuthor()=" + getAuthor() + "]";
	}
	
	
}
