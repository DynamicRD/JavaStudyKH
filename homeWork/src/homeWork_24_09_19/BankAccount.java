package homeWork_24_09_19;

public class BankAccount {
	private String owner;
	private int balance;
	private int accountNumber;
	public BankAccount() {}
	public BankAccount(String owner, int balance, int accountNumber) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println(money+"만큼 입금되어서 총액 "+balance+ "입니다.");
	}
	public void withdraw(int money) {
		if(money > balance)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;
		System.out.println(money+"만큼 출금되어서 총액 "+balance+ "입니다.");		
	}
	
	
	
}
