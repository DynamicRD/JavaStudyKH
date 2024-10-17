package homework_24_09_25;

public class Person {
	private String name;
	private String address;
	private int phoneNum;
	public Person() {	}
	public Person(String name, String address, int phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + "]";
	}
	
	
	
	
	
	
}
