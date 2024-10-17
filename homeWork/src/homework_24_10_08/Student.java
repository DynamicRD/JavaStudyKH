package homework_24_10_08;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	String name;
	String address;
	String phone;
	//-------------------------------
	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Student() {
		this(null,null,null);
	}
	//-------------------------------
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//-------------------------------
	@Override
	public int compareTo(Student o) {
		return this.phone.compareTo(o.phone);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(phone);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student stu = (Student)obj;
		return this.phone.equals(stu.phone);
	}
}
