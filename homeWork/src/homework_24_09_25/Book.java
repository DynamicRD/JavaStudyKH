package homework_24_09_25;

public class Book {
		private String title;
		private int pages;
		private String author;
		public Book(String title, int pages, String author) {
			this.title = title;
			this.pages = pages;
			this.author = author;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPages() {
			return pages;
		}
		public void setPages(int pages) {
			this.pages = pages;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", pages=" + pages + ", author=" + author + "]";
		}
		
		
}
