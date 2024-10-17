package homeWork_24_09_20;

public class Employee {
	private String name;
	private int phoneNum;
	private int annualIncome;
	public Employee(String name, int phoneNum, int annualIncome) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.annualIncome = annualIncome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNum=" + phoneNum + ", annualIncome=" + annualIncome + "]";
	}
	
}
