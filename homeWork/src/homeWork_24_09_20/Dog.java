package homeWork_24_09_20;

public class Dog {
		private String name;
		private String breed;
		private int age;
		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public Dog(String name, String breed, int age) {
			this.name = name;
			this.breed = breed;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getbreed() {
			return breed;
		}
		public void setbreed(String breed) {
			this.breed = breed;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
		}
		
}
