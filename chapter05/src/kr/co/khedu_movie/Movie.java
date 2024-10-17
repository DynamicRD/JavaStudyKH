package kr.co.khedu_movie;

public class Movie {
		private String name;
		private String director;
		
		public Movie(String name, String director) {
			this.name = name;
			this.director = director;
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


		@Override
		public String toString() {
			return "Movie [name=" + name + ", director=" + director + "]";
		}
		
		public void information()
		{
			System.out.println("=========================");
			System.out.println("영화제목: "+name);
			System.out.println("영화감독: "+director);
			System.out.println("=========================");
			
		}
		
		
		
}
