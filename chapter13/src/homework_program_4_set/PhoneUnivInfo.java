package homework_program_4_set;

import java.util.Objects;

public class PhoneUnivInfo extends PhoneInfo {
	private  String major;
	private int year;
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name,phoneNumber);
		this.major = major;
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "PhoneCompanyInfo [Name=" + this.getName() + ", phoneNumber=" + this.getPhoneNumber() + ", major=" + major + ", year=" + year
				+ "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.getPhoneNumber());
	}
	@Override
	public boolean equals(Object obj) {
		PhoneUnivInfo pci = null;
		if(!(obj instanceof PhoneUnivInfo))
		{
			System.out.println("부자관계가 다릅니다.");
			return false;
		}
		pci = (PhoneUnivInfo) obj;
		if(this.getPhoneNumber().equals(pci.getPhoneNumber()))
		{
			return true;
		}
		return false;
	}
	

}