package homeWork_24_09_19;

public class DogMain {

	public static void main(String[] args) {
		Dog dog = new Dog("진돗개",5,"황색");
		System.out.println(dog.toString());
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}

}
