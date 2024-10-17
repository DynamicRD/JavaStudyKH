package homework_program_4_set;


import java.util.Objects;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	//-----------------------
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name,phoneNumber);
		this.company = company;
	}
	//------------------------
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//---------------------------
	@Override
	public String toString() {
		return "PhoneUnivInfo [Name=" + this.getName()+ ", phoneNumber=" + this.getPhoneNumber() + ", company=" + company + "]";
	}
	//------------------------
	@Override
	public int hashCode() {
		return Objects.hash(this.getPhoneNumber());//문자열
		//int pk면 그냥 그대로 값을 써라.
	}
	@Override
	public boolean equals(Object obj) {
		PhoneCompanyInfo pui = null;
		if(!(obj instanceof PhoneCompanyInfo))
		{
			return false;
		}
		pui = (PhoneCompanyInfo)obj;
		return (this.getPhoneNumber().equals(pui.getPhoneNumber()));
	}
	//--------------------
	
}