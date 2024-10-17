package homeWork_24_09_20;

public class BankAccount {
	private String name;
	private int accountNum;
	private int money;
	private double interestRate;
	
	public BankAccount() {}

	public BankAccount(String name, int accountNum, int money, double interestRate) {
		this.name = name;
		this.accountNum = accountNum;
		this.money = money;
		this.interestRate = interestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNum=" + accountNum + ", money=" + money + ", interestRate="
				+ interestRate + "]";
	}
	
	
}
