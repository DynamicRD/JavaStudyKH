package homework_program_3;

import java.util.Objects;

public class PhoneInfo implements Comparable<PhoneInfo>{
	private String name;
	private String phoneNumber;
	private String birthday;
	//---------------------------
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//-------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	//----------------------------
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + "]";
	}
	//----------------------------
	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		PhoneInfo p = null;
		if(!(obj instanceof PhoneInfo))
		{
			System.out.println("객체가 소속되지않습니다.");
			return false;
		}
		p = (PhoneInfo)obj;
		return phoneNumber == p.phoneNumber;
	}
	@Override
	public int compareTo(PhoneInfo o) {
		return phoneNumber.compareTo(o.phoneNumber); 
	}
	
	
}
