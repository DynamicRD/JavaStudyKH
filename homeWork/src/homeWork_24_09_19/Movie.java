package homeWork_24_09_19;

public class Movie {
	private String movieName;
	private int movieScore;
	private String movieDirectorName;
	private int openYear;
	public Movie() {
	}
	public Movie(String movieName, int movieScore, String movieDirectorName, int openYear) {
		this.movieName = movieName;
		this.movieScore = movieScore;
		this.movieDirectorName = movieDirectorName;
		this.openYear = openYear;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieScore() {
		return movieScore;
	}
	public void setMovieScore(int movieScore) {
		this.movieScore = movieScore;
	}
	public String getMovieDirectorName() {
		return movieDirectorName;
	}
	public void setMovieDirectorName(String movieDirectorName) {
		this.movieDirectorName = movieDirectorName;
	}
	public int getOpenYear() {
		return openYear;
	}
	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieScore=" + movieScore + ", movieDirectorName="
				+ movieDirectorName + ", openYear=" + openYear + "]";
	}
	public void print() {
		System.out.println(movieName);
		System.out.println(movieScore);
		System.out.println(movieDirectorName);
		System.out.println(openYear);
		
	}
	
}
