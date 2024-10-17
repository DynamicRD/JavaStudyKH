package homework_24_09_25;

public class Customer extends Person {
	private int customerNum;
	private int milige;
	public Customer() {
		super();
	}
	public Customer(String name, String address, int phoneNum) {
		super(name, address, phoneNum);
	}
	public Customer(int customerNum, int milige) {
		super();
		this.customerNum = customerNum;
		this.milige = milige;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	public int getMilige() {
		return milige;
	}
	public void setMilige(int milige) {
		this.milige = milige;
	}
	@Override
	public String toString() {
		return "Customer [customerNum=" + customerNum + ", milige=" + milige + "]";
	}
	
	
}
