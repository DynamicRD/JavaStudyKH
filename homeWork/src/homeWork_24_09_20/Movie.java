package homeWork_24_09_20;

public class Movie {
	private String name;
	private String director;
	private String madeCompany;
	public Movie() {}
	public Movie(String name, String director, String madeCompany) {
		this.name = name;
		this.director = director;
		this.madeCompany = madeCompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMadeCompany() {
		return madeCompany;
	}
	public void setMadeCompany(String madeCompany) {
		this.madeCompany = madeCompany;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + ", madeCompany=" + madeCompany + "]";
	}
	
	
	
}
