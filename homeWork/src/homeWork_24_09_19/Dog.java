package homeWork_24_09_19;

public class Dog {
	private String breed;
	private int age;
	private String color;
	public Dog() {
	}
	public Dog(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	public void barking()
	{
		System.out.println(age+"살 "+color+" "+breed+"가 짖습니다.");
	}
	public void hungry()
	{
		System.out.println(age+"살 "+color+" "+breed+"가 배고픕니다.");
	}
	public void sleeping()
	{
		System.out.println(age+"살 "+color+" "+breed+"가 잠니다.");
	}

	
	
}
