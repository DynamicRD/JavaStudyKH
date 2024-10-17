package homework_program_4_set;

import java.util.Objects;

public class PhoneInfo implements Comparable<PhoneInfo>{
	private String name;
	private String phoneNumber;	//pk = uk
	//---------------------------
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo() {
		this(null,null);
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
	
	//----------------------------
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber+" ]";
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
		//숫자면 그냥 빼라
	}
	
	
}