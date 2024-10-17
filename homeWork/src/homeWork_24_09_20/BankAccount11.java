package homeWork_24_09_20;

public class BankAccount11 {
	private int money;

	public BankAccount11(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "BankAccount [money=" + money + "]";
	}

	public int transfer(int amount, BankAccount11 otherAccount)   
	{
		if(amount > money)
		{
			System.out.println("잔액 부족으로 송금 못했습니다.");
			System.out.println("송금금액을 반환합니다.");
			return 0;
		}
		money -= amount;
		otherAccount.setMoney(otherAccount.getMoney()+amount);
		System.out.println("잘 송금했습니다.");
		System.out.println("송금금액을 반환합니다.");
		return amount;
	}
}
