package homeWork_24_09_19;

public class MovieMain {

	public static void main(String[] args) {
		Movie movie = new Movie("태극기휘날리며",90,"강제규",2004);
		System.out.println(movie.toString());
		movie.print();
	}

}
